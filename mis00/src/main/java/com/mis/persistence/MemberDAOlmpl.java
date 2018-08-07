package com.mis.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.MemberVO;

@Repository
public class MemberDAOlmpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.mis.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		
		// com.mis.mapper.memberMapper.getTime
		return sqlSession.selectOne(namespace + ".getTime") ;
	}

	@Override
	public void insertMember(MemberVO vo) {
		
		sqlSession.insert(namespace + ".insertMember", vo);
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("userid", userid);
		
		return sqlSession.selectOne(namespace + ".readMember",param );
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace + ".readWithPW", paramMap);
	}

	@Override
	public void updateMember(MemberVO vo) throws Exception {
		
		sqlSession.update(namespace + ".updateMember", vo);
	}

	@Override
	public void deleteMember(String userid, String userpw) throws Exception {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		
		sqlSession.delete(namespace + ".deleteMember", paramMap);
	}

}
