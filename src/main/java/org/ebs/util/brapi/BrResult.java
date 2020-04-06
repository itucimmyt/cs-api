package org.ebs.util.brapi;

import java.util.List;

/**
 * 
 * @author JAROJAS
 *
 * @param <T> the payload data type
 */
class BrResult<T> {

	public BrResult () {
		
	}

	private List<T> data;

	public BrResult(List<T> data) {
		super();
		this.data = data;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
