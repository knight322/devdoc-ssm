/**
 * Copyright (C) 2016 DevDoc.org
 *
 *
 * @className:org.devdoc.sf.utils.ManagerInterceptor.java
 * @description:TODO
 * 
 * @version:v1.0.0
 * @author:zhujg
 * @createTime:2016-4-14上午09:21:55
 * 
 * 
 */
package org.devdoc.sf.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @description:TODO
 * @author zhujg
 *
 */
public class ManagerInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest req, HttpServletResponse rsp, Object handler) throws Exception {
		return true;
	}
	public void postHandle(HttpServletRequest req, HttpServletResponse rsp, Object handler, ModelAndView modelAndView) throws Exception {
		
	}
}
