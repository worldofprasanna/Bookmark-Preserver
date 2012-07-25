package com.bmp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmp.entities.Bookmark;
import com.bmp.service.BMPService;


@Controller
@RequestMapping("/save")
public class ApplicationController {

	@Autowired
	private BMPService bmpService;
	
	private static final Logger logger = Logger.getLogger(ApplicationController.class);
	
	@RequestMapping(value="/bookmark", method=RequestMethod.POST)
	public @ResponseBody String saveBookmark(@RequestParam String url, ModelMap model){
		logger.debug("Book Mark Url to be saved :"+url);
		Bookmark bookmark = new Bookmark();
		bookmark.setUrl(url);
		bookmark.setUserId("test");
		Long pkey = bmpService.saveBookmark(bookmark);
		logger.debug("Bookmark saved :"+pkey);
		return "Success";
	}

	public void setBmpService(BMPService bmpService) {
		this.bmpService = bmpService;
	}

	public BMPService getBmpService() {
		return bmpService;
	}
	
}
