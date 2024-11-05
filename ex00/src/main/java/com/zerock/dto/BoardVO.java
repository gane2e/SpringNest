package com.zerock.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {

		private String num;
	    private String title;
	    private String content;
	    private String id;
	    private Date postdate;
	    private String visitcount;
}
