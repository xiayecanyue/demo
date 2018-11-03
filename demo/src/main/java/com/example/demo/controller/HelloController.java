package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping(value="/index",produces="application/json;charset=utf-8")
	@ResponseBody
	public String index() {
		return "{result:'success'}";
	}
}
