package org.ebs.util.brapi;

import lombok.Getter;
import lombok.Setter;

/**
 * Global format for any BrAPI call
 * 
 * @author JAROJAS
 *
 * @param <T> the payload type in this response
 */
@Getter @Setter
public class BrResponse<T> {

	/**
	 * Contains the payload
	 */
	private T result;
	private BrMetadata metadata = new BrMetadata();
}
