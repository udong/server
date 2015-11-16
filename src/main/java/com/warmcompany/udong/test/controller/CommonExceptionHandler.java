/**
 * 2015. 11. 16.
 * Copyright by yyh / Hubigo AIAL
 * CommonExceptionHandler.java
 */
package com.warmcompany.udong.test.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice("com.warmcompany.udong")
public class CommonExceptionHandler {
	
	/**
	 * 컨트롤러 어드바이스에 걸린 패키지 전체에서 에러 찾음.
	 * 적용하려면 빈 등록해야 함.
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String handlerException(Exception ex)	{
		return "asd";
	}
}
