package com.in28minutes.spring.basics.springin5steps.xml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS) // 
public class XmlJdbcConnection {
	public XmlJdbcConnection() {
		System.out.println("JDBC Connection is ready");
	}
}
