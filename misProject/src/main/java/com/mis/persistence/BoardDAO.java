package com.mis.persistence;

import java.util.List;

import com.mis.domain.BoardVO;

public interface BoardDAO {
	/**
	 * ����
	 * @param vo
	 * @throws Exception
	 */
	public void create (BoardVO vo) throws Exception ;
	/**
	 * ��ȸ
	 * @param bno
	 * @return
	 * @throws Exception
	 */
	public BoardVO read (int bno) throws Exception;
	/**
	 * ����
	 * @param vo
	 * @throws Exception
	 */
	public void update (BoardVO vo) throws Exception;
	/**
	 * ����
	 * @param vo
	 * @throws Exception
	 */
	public void delete (int bno) throws Exception;
	/**
	 * ������ȸ
	 * @return
	 * @throws Exception
	 */
	public List<BoardVO> listAll() throws Exception;
	/**
	 * ViewCnt ����
	 * @throws Exception
	 */
	public void updateViewCnt(int bno) throws Exception;
}
