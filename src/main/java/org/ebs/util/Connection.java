package org.ebs.util;

import java.util.List;
import java.util.function.Function;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class Connection<T> extends PageImpl<T> {

    private static final long serialVersionUID = 1L;

    public Connection(List<T> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    @Override
    public int getNumber() {
        return super.getNumber() + 1;
    }
    
    @Override
	public <U> Connection<U> map(Function<? super T, ? extends U> converter) {
		return new Connection<>(getConvertedContent(converter), getPageable(), getTotalElements());
	}

}