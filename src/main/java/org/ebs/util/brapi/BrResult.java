package org.ebs.util.brapi;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author JAROJAS
 *
 * @param <T> the payload data type
 */
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class BrResult<T> {

	private List<T> data;

	@Override
	public String toString() {
		return String.format("data [%s]", data);
	}

}
