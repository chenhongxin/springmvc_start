package com.itcast.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itcast.ssm.po.ItemsCustomer;
import com.itcast.ssm.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	@RequestMapping(value = "/queryItems")
	public String queryItems(Model model, HttpServletRequest request) {
		try {
			List<ItemsCustomer> itemsCustomers = itemsService.findItemsList();
			model.addAttribute("itemsCustomers", itemsCustomers);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/items/itemsList";
	}

	@RequestMapping(value = "/findItem")
	public ModelAndView findItem(@RequestParam(value = "id", required = false) Integer itemsId) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			// 调用service查询商品信息
			ItemsCustomer itemsCustomer = itemsService.findItemsById(itemsId);
			modelAndView.addObject("itemsCustomer", itemsCustomer);
			modelAndView.setViewName("/items/editItems");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}

	@RequestMapping(value = "/editItem")
	public String editItem(Integer id, ItemsCustomer itemsCustomer) {
		
		itemsService.updateItems(id, itemsCustomer);
		
		return "/success";
	}

}
