package com.mis.web;

import javax.inject.Inject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.BoardVO;
import com.mis.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Test
	public void Test01_create() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setTitle("새 게시글");
		vo.setContent("내용을 적으세요");
		vo.setWriter("user01");
		
		logger.debug("TEST : " + vo);
		
		dao.create(vo);
	}
//	
//	@Test 
//	public void Test02_update() throws Exception {
//		BoardVO vo = new BoardVO();
//		vo.setBno(1);
//		vo.setTitle("아아아ㅏㅏㅏㅏ");
//		vo.setContent("아아ㅏㅏㅏㅏㅏㅏㅏ");
//		vo.setWriter("user01");
//		
//		dao.update(vo);
//	}
//	
//	@Test
//	public void Test03_read() throws Exception {
//		logger.info(dao.read(1).toString());
//	}
//	
//	@Test
//	public void Test04_delete() throws Exception {
//		dao.delete(1);
//	}
//	
//	@Test
//	public void Test05_listAll() throws Exception {
//		logger.info(dao.listAll().toString());
//	}
}
