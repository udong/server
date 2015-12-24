package com.warmcompany.udong.common;

import java.util.Map;

/**
 * 2015. 12. 20.
 * Copyright by joyhan / HUFS
 * ResultMapGenerator
 */
public class ResultMapGenerator {
	
	protected static final String resultKey = "resultCode";
	
	public static void putSuccessCode(Map<String, Object> map)	{
		map.put(resultKey, CommonCode.SUCCESS_CODE);
	}
	
	public static void putErrorCode(Map<String, Object> map)	{
		map.put(resultKey, CommonCode.ERROR_CODE);
	}
}
