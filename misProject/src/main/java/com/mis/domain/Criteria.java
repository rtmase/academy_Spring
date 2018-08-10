package com.mis.domain;

public class Criteria {
	
	//변수 선언
	/** 현재 페이지 */
	private int page;
	/** 보여주는 페이지 갯수*/
	private int perPageNum;
	/** 게시글 */
	private int startPage;
	
	//생성자 선언
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page <= 0) {
			this.page = 1;
			return;
		}
		
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}
	
	
	public int getStartPage() {
		return this.startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	// method for Mybatis SQL Mapper
	public int getPageEnd() {
		// 페이지 인덱스 x perPageNum = endpage
		return this.startPage + 9;
	}
	// method for Mybatis SQL Mapper
	public int getPageStart() {
		// 페이지 인덱스 x perPageNum - 9 = startpage
		this.startPage = (this.page * perPageNum) - 9;
				
		return this.startPage;
	}
	
	// toString 선언
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", startPage=" + startPage + "]";
	}
	
	
	
}
