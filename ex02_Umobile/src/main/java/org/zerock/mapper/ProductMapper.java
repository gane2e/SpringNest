package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.ProductVO;


public interface ProductMapper {
	
	//전체리스트 가져오기
	public List<ProductVO> getProduct();

	//1개 상품 정보 가져오기
	public ProductVO read(Long cno);
	
}
