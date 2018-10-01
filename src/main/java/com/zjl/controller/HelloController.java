package com.zjl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 描述:
 * @author  zhoujialin
 * @created 2018年10月1日 下午9:39:11
 * @since   v1.0.0
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
