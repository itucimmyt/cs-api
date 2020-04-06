package org.ebs.services.converter;

import org.ebs.model.ExampleChild;
import org.ebs.services.to.ExampleChildTO;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class ExampleChildConverter implements Converter<ExampleChild, ExampleChildTO> {

    @Override
    public ExampleChildTO convert(ExampleChild source) {
        ExampleChildTO target = new ExampleChildTO();
        BeanUtils.copyProperties(source, target);

        //example of custom conversion
        // for when fields in TO does not match the ones in the model
        target.setCustomField(String.format("CHILD-%04d-%010d"
            ,target.getId()
            ,target.getaNumber()));

        return target;
    }
    
}