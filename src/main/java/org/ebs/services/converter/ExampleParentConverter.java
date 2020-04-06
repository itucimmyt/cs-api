package org.ebs.services.converter;

import org.ebs.model.ExampleParent;
import org.ebs.services.to.ExampleParentTO;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Example conversion of Model -> TO. Converters can invoke other converters directly, 
 * but services must invoke them through the ConversionService
 * Converters must use @Component
 */
@Component
class ExampleParentConverter implements Converter<ExampleParent, ExampleParentTO> {

    @Override
    public ExampleParentTO convert(ExampleParent source) {
        ExampleParentTO target = new ExampleParentTO();
        BeanUtils.copyProperties(source, target);

        return target;
    }

}