package com.mis.persistence;

import java.util.List;

import com.mis.domain.Criteria;
import com.mis.domain.ProductVO;
import com.mis.domain.SearchCriteria;

public interface ProductDAO {

   /**
    * Product ���� 1���� �߰���
    * @param vo : �߰��� ��ǰ ����
    * @throws Exception
    */
   public void insert(ProductVO vo) throws Exception;
   
   /**
    * Product ���� 1���� ��ȸ��
    * @param prodcod : ��ȸ�� ��ǰ������ �ڵ尪(prodcod)
    * @return
    * @throws Exception
    */
   public ProductVO read(Integer prodcod) throws Exception;

   /**
    * Product 1���� ������ ������
    * @param vo : ������ ��ǰ������ �ڵ尪(prodcod)�� ����ִ� ��ü
    * @throws Exception
    */
   public void update(ProductVO vo) throws Exception;
   
   /**
    * Product 1���� ������ ������
    * @param prodcod : ������ ��ǰ������ �ڵ尪(prodcod)
    * @throws Exception
    */
   public void delete(Integer prodcod) throws Exception;
   
   /**
    * ��ü ��ǰ ����� List<Product> Ÿ������ �ٲپ� �����Ѵ�.
    * @return
    * @throws Exception
    */
   public List<ProductVO> searchlist() throws Exception;
   
   public int countPaging(Criteria cri) throws Exception;
   
   // use for dynamic sql
   public List<ProductVO> listSearch(SearchCriteria cri) throws Exception;
   
   public int listSearchCount(SearchCriteria cri) throws Exception;

}