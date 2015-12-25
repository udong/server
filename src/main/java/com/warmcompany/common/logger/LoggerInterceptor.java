/**
 * 2015. 10. 11.
 * Copyright by yyh / Hubigo AIAL
 * LoggerInterceptor.java
 */
package com.warmcompany.common.logger;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerInterceptor extends HandlerInterceptorAdapter {
	protected Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if(logger.isDebugEnabled())	{
			logger.debug("=====================REQUEST START===========================");
			logger.debug(request.getRequestURI());
			Enumeration<String> names = request.getParameterNames();
			
			while(names.hasMoreElements())	{
				String name = names.nextElement();
				for(Object o : request.getParameterValues(name))	{
					logger.debug(name);
					logger.debug(o.toString());
				}
			}
		}
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if(logger.isDebugEnabled())	{
			logger.debug("=====================REQUEST END===========================");
		}
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
}
