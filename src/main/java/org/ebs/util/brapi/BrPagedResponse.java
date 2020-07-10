package org.ebs.util.brapi;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Global format for any paged BrAPI call.
 * 
 * @author JAROJAS
 *
 * @param <T> the payload type in this response
 */
@Getter @Setter
public class BrPagedResponse<T> {

	/**
	 * Contains the payload
	 */
	private BrResult<T> result;
	private BrMetadata metadata = new BrMetadata();
}
