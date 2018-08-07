package com.mis.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		
		logger.info("doC called but redirect to /doF...");
		rttr.addFlashAttribute("msg", "this is the Message!! with redirect");
		
		return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public String doF(@ModelAttribute("msg") String msg) {
		
		logger.info("doC called... "+ msg);
		
		return "result";
	}


}
