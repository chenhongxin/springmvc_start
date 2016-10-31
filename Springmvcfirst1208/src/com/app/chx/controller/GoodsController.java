package com.app.chx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoodsController {

	@RequestMapping(value = "queryGoods")
	public ModelAndView queryGoods() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("value", "數據");
		modelAndView.setViewName("items/items_controller");
		return modelAndView;
	}

}
