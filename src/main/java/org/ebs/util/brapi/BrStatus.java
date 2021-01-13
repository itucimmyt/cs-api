package org.ebs.util.brapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Models status section of a BrAPI response as well as status codes and messages
 * @author JAROJAS
 *
 */
@Getter
@AllArgsConstructor @NoArgsConstructor
class BrStatus {

	static final int SUCCESS_CODE = 0;
	static final int ERROR_CODE = 1;
	static final BrStatus SUCCESS = new BrStatus(SUCCESS_CODE, "success");
	static final BrStatus ERROR = new BrStatus(ERROR_CODE, "server error");

	private int code;
	private String message;

	@Override
	public String toString() {
		return String.format("BrStatus [code=%s, message=%s]", code, message);
	}

}
