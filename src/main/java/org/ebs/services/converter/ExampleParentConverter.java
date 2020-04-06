package org.ebs.services.converter;

import org.ebs.model.ExampleParent;
import org.ebs.services.to.ExampleParentTO;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class ExampleParentConverter implements Converter<ExampleParent, ExampleParentTO> {

    @Override
    public ExampleParentTO convert(ExampleParent source) {
        ExampleParentTO target = new ExampleParentTO();
        BeanUtils.copyProperties(source, target);

        return target;
    }

}