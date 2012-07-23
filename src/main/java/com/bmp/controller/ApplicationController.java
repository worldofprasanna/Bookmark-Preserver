package com.bmp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/save")
public class ApplicationController {

	@RequestMapping(value="/bookmark", method=RequestMethod.POST)
	public @ResponseBody String saveBookmark(@RequestParam String url, ModelMap model){
		System.out.println("Book Mark Url to be saved :"+url);
		return "Success";
	}
	
}
