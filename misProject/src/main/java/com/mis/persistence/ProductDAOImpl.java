package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.Criteria;
import com.mis.domain.ProductVO;
import com.mis.domain.SearchCriteria;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	private static final String namespace = "com.mis.mapper.productMapper";

	@Inject
	SqlSession sqlSession;
	
	@Override
	public void insert(ProductVO vo) throws Exception {
		sqlSession.insert(namespace + ".insert"	, vo);
	}

	@Override
	public ProductVO read(Integer prodcod) throws Exception {
		return sqlSession.selectOne(namespace + ".read", prodcod);
	}

	@Override
	public void update(ProductVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);
	}

	@Override
	public void delete(Integer prodcod) throws Exception {
		sqlSession.delete(namespace + ".delete", prodcod);
	}

	//listCriteria 
	@Override
	public List<ProductVO> searchlist() throws Exception {
		return sqlSession.selectList(namespace + ".searchlist");
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		return sqlSession.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<ProductVO> listSearch(SearchCriteria cri) throws Exception {
		return sqlSession.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return sqlSession.selectOne(namespace + ".listSearchCouont", cri);
	}

}
