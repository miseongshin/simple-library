package com.bstar.starter.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bstar.starter.common.abstractCommonController;

@Controller
public class homeController extends abstractCommonController {
	
	@GetMapping(value="/")
	public String home () {
		
		return "home";
	}

}
