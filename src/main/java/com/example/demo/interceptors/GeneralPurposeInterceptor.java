package com.example.demo.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class GeneralPurposeInterceptor implements HandlerInterceptor {
	
	private final Logger LOG = LoggerFactory.getLogger(GeneralPurposeInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.info("preHandle GeneralPurposeInterceptor ");
		return true;
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		LOG.info("postHandle GeneralPurposeInterceptor ");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		LOG.info("afterCompletion GeneralPurposeInterceptor ");
	
	}

    

}