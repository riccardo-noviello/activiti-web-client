package com.riccardonoviello.simpletimesheet;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String getIndex(Map<String, Object> model) {

		model.put("model", new Task());
		return "index";
	}

}
