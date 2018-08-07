package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.MemberVO;
import com.mis.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

		@Inject
		private MemberDAO dao;
		
//		@Test
//		public void testTime() throws Exception{
//			System.out.println(dao.getTime());
//		}
//		
//		@Test
//		public void testInsertMember() throws Exception {
//			MemberVO vo = new MemberVO();
//			//vo.setUserId("user00");
//			vo.setUserid("user01");
//			vo.setUserpw("user00");
//			vo.setUsername("USER00");
//			vo.setEmail("user00@aaa.com");
//			
//			dao.insertMember(vo);
//		}
		
		@Test
		public void testReadWithPWMember() throws Exception {
			
			System.out.println(dao.readWithPW("user01", "user00"));
		}
		
		@Test
		public void testReadMember() throws Exception {
			
			System.out.println(dao.readMember("user01"));
		}
}
