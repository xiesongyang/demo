package com.ahrisy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.ahrisy.domain.MyDomain;
import com.ahrisy.service.MyService;
@Service
public class MyserviceImpl implements MyService {
	@Override
	public void aa() {
		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:applicationContext.xml"); 
		MyDomain a= (MyDomain)ac.getBean("nn");
		a.mm();
	}

}
