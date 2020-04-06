package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class ArmToBrRequestConverter implements Converter<Object, String> {

    @Override
    public String convert(Object source) {
       return null;
    }
    
}