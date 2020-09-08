package org.ebs.util.brapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Models pagination section of a BrAPI response
 * 
 * @author JAROJAS
 *
 */
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
class BrPagination {

	private int pageSize;
	private int currentPage;
	private long totalCount;
	private int totalPages;

}
