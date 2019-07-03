package cn.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class DemoController {
@RequestMapping("hello")	
public String sayHello(){
	return "hello word";
}
}
