package com.mis.persistence;

import java.util.List;

import com.mis.domain.BoardVO;

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
}
