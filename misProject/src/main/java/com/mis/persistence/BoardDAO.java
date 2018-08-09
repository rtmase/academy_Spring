package com.mis.persistence;

import java.util.List;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.domain.SearchCriteria;

public interface BoardDAO {
	/**
	 * 생성
	 * @param vo
	 * @throws Exception
	 */
	public void create (BoardVO vo) throws Exception ;
	/**
	 * 조회
	 * @param bno
	 * @return
	 * @throws Exception
	 */
	public BoardVO read (int bno) throws Exception;
	/**
	 * 수정
	 * @param vo
	 * @throws Exception
	 */
	public void update (BoardVO vo) throws Exception;
	/**
	 * 삭제
	 * @param vo
	 * @throws Exception
	 */
	public void delete (int bno) throws Exception;
	/**
	 * 전제조회
	 * @return
	 * @throws Exception
	 */
	public List<BoardVO> listAll() throws Exception;
	/**
	 * ViewCnt 증가
	 * @throws Exception
	 */
	public void updateViewCnt(int bno) throws Exception;
	
	public List<BoardVO> listPage(int page) throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;
	
	// use for dynamic sql
	/**
	 * 조건 검색
	 * @param cri
	 * @return
	 * @throws Exception
	 */
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
	/**
	 * 조건 검색한 내용의 수
	 * @param cri
	 * @return
	 * @throws Exception
	 */
	public int listSearchCount(SearchCriteria cri) throws Exception;
}
