package com.mis.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mis.domain.ProductVO;

@Controller
public class SampleControllerPd {

	private static final Logger logger = LoggerFactory.getLogger(SampleControllerPd.class);
	
	@RequestMapping("doP")
	public String doP(Model model) {
		
		logger.info("doP called...");
		
		ProductVO product = new ProductVO("û����", 10000, 100, 20);
		
		model.addAttribute(product);
		
		return "productDetail2";
	}
}
