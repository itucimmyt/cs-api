package org.ebs.util.brapi;

/**
 * Global format for any BrAPI call
 * 
 * @author JAROJAS
 *
 * @param <T> the payload type in this response
 */
public class BrResponse<T> {

	private BrMetadata metadata;
	/**
	 * Contains the payload
	 */
	private T result;
	
	public BrResponse() {
		metadata = new BrMetadata();
	}
	
	public BrMetadata getMetadata() {
		return metadata;
	}
	public void setMetadata(BrMetadata metadata) {
		this.metadata = metadata;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
}
