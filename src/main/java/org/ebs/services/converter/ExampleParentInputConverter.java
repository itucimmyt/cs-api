package org.ebs.services.converter;

import java.util.HashSet;

import org.ebs.model.ExampleChild;
import org.ebs.model.ExampleParent;
import org.ebs.services.to.ExampleParentInput;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Example conversion of TO (input) -> Model. Converters can invoke other converters directly, 
 * but services must invoke them through the ConversionService
 * Converters must use @Component
 */
@Component
class ExampleParentInputConverter implements Converter<ExampleParentInput, ExampleParent> {

    @Override
    public ExampleParent convert(ExampleParentInput source) {
        ExampleParent target = new ExampleParent();
        BeanUtils.copyProperties(source, target);
        target.setChildren(new HashSet<ExampleChild>());
/**
 * Example of conversion when a simple type (array of integers) is converted to a complex type (set of ExampleChilds)
 */
        for (int aNumber : source.getChildren()) {
            ExampleChild ec = new ExampleChild();
            ec.setaNumber(aNumber);
            ec.setParent(target);
            target.getChildren().add(ec);
        }
        
        return target;
    }

}