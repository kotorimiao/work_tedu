package cn.xm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping("/init")
	public String init() {
		return "hello , spring boot";
	}
	//1、查找全部
	@RequestMapping("/find")
	public String find() {
		return "hello , spring boot";
	}
	
}