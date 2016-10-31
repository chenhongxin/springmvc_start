package com.app.chx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ItemsController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("value", "數據");
		modelAndView.setViewName("/WEB-INF/jsp/items/items_controller.jsp");
		
		return modelAndView;
	}

}
