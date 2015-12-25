package com.warmcompany.common.exception;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.warmcompany.udong.common.ResultMapGenerator;

/**
 * 2015. 12. 25.
 * Copyright by joyhan / HUFS
 * CommonExceptionHandler
 */
@ControllerAdvice("com.warmcompany")
public class CommonExceptionHandler {
	/**
	 * 컨트롤러 어드바이스에 걸린 패키지 전체에서 에러 찾음.
	 * TODO Exception별로 나누어 처리할 수 있또록 할것.
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String,Object> handlerException(Exception ex)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		resultMap.put("Message", "Server ERROR : Exception 발생");
		ResultMapGenerator.putErrorCode(resultMap);
		return resultMap;
	}
}
