package com.zerock.dto;

import lombok.Data;

@Data
public class ProductVO {
	
	private Long product_id; 	//상품번호
    private String title;       // 상품명
    private Long cost_price;  	// 원가
    private Long discount_rate;  // 할인율
    private Long sale_price;   	// 할인가

}
