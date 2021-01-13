package org.ebs.util.brapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

/**
 * Models metadata section of a BrAPI response
 * @author JAROJAS
 *
 */
@JsonInclude(value=Include.NON_NULL)
@Getter @Setter
class BrMetadata {

	private BrPagination pagination;
	private List<BrStatus> status;
	private List<String> dataFiles;

	@Override
	public String toString() {
		return String.format("BrMetadata [%s, %s]", pagination, status);
	}

}
