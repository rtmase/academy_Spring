package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.CustomerVO;
import com.mis.persistence.CustomerDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CustomerDAOTest {

	@Inject
	private CustomerDAO dao;
	
//	@Test
//	public void TestInsertCustomer() throws Exception {
//		CustomerVO vo = new CustomerVO();
//		
//		vo.setUserid("user03");
//		vo.setName("nope");
//		
//		dao.insertCustomer(vo);
//	}
	
	@Test
	public void TestupdateCustomer() throws Exception {
		CustomerVO vo = new CustomerVO();
		
		vo.setUserid("user01");
		vo.setBirthyear(1993);
		vo.setAddress("korea");
		vo.setPhone("01012345678");
		vo.setGrade("VIP");
		
		dao.updateCustomer(vo);
	}
	
//	@Test
//	public void TestdeleteCustomer() throws Exception {
//		dao.deleteCustomer("user03");
//	}
//	
//	@Test
//	public void TestreadCustomer() throws Exception {
//		System.out.println(dao.readCustomer("user00"));
//	}
}
