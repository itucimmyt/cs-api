package org.ebs.util.brapi;

/**
 * Global format for any paged BrAPI call.
 * @author JAROJAS
 *
 * @param <T> the payload type in this response
 */
public class BrPagedResponse<T> {

	private BrMetadata metadata;
	/**
	 * Contains the payload
	 */
	private BrResult<T> result;
	
	public BrPagedResponse() {
		metadata = new BrMetadata();
	}
	
	public BrMetadata getMetadata() {
		return metadata;
	}
	public void setMetadata(BrMetadata metadata) {
		this.metadata = metadata;
	}
	public  BrResult<T> getResult() {
		return result;
	}
	public void setResult(BrResult<T> result) {
		this.result = result;
	}
	
}
