package com.zerock.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zerock.dto.ProductVO;
import com.zerock.service.MainService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequiredArgsConstructor
public class MainController {
	
	private final MainService service;

	@GetMapping( value = "/main", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<ProductVO>> getProduct() {
		
		List<ProductVO> productList = service.getProduct();
		
		log.info("상품 목록: " + productList );
		
		return new ResponseEntity<>(productList , HttpStatus.OK);
	} 
}
