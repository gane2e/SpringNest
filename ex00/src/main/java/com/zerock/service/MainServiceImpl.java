package com.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zerock.dto.ProductVO;
import com.zerock.mapper.BoardMapper;
import com.zerock.mapper.MainMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService{
	
	private final MainMapper mapper;

	@Override
	public List<ProductVO> getProduct() {
		return mapper.getProduct();
	}

}
