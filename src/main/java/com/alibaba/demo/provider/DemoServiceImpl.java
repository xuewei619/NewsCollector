package com.alibaba.demo.provider;

import com.alibaba.demo.DemoService;

public class DemoServiceImpl implements DemoService{

	public String sayHello() {
		
		return "hello dubbo";
	}

}
