package com.mis.domain;

public class Criteria {
	
	//���� ����
	/** ���� ������ */
	private int page;
	/** �����ִ� ������ ����*/
	private int perPageNum;
	/** �Խñ� */
	private int startPage;
	
	//������ ����
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
		// ������ �ε��� x perPageNum = endpage
		return this.startPage + 9;
	}
	// method for Mybatis SQL Mapper
	public int getPageStart() {
		// ������ �ε��� x perPageNum - 9 = startpage
		this.startPage = (this.page * perPageNum) - 9;
				
		return this.startPage;
	}
	
	// toString ����
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", startPage=" + startPage + "]";
	}
	
	
	
}
