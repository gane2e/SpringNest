package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ProductVO {

	   private long cno;            // 식별 번호
	   private String serial;       // 휴대폰 시리얼넘버
	   private String giga;         // 휴대폰 용량
	   private long price;          // 휴대폰 가격
	   private String phone_Name;    // 휴대폰 이름
	   private String phone_Size;    // 휴대폰 사이즈
	   private String phone_Weight;  // 휴대폰 무게
	   private String camera;       // 휴대폰 카메라 정보
	   private String battery;      // 휴대폰 배터리 정보
	   private String memory;       // 휴대폰 메모리 정보
	   private String status;       // 휴대폰 상태
	   private String manufacturer; // 제조사
	   private String color;        // 색상
	   private String cpu;          // CPU 정보
	   private String options;      // 기타 옵션
	   private Date release_Date;    // 출시일
	   private String os;           // 운영체제 (OS)
	
}
