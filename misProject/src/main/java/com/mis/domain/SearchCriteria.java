package com.mis.domain;

public class SearchCriteria extends Criteria {
	
	// 변수 선언
	/** 검색 조건 */
	private String searchType;
	/** 키워드 */
	private String keyword;
	
	// 접근자 / 생성자 선언
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	// toString 선언
	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + "]";
	}
	
	
}
