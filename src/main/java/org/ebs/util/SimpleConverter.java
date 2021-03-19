package org.ebs.util;

import static org.ebs.util.Utils.copyNotNulls;

import org.springframework.core.convert.converter.Converter;

public abstract class SimpleConverter<S,T> implements Converter<S, T> {

    @Override
    public T convert(S source) {
        T target = target();
        copyNotNulls(source, target);

        return target;
    }

    public abstract T target();

}
