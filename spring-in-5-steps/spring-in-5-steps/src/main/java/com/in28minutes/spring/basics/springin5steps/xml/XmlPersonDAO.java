package com.in28minutes.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class XmlPersonDAO {
//	@Autowired
	XmlJdbcConnection xmljdbcConnection;// we need different bean whenever we call for the bean of PersonDAO so we put 
									//the annotation ofr ScopedProxyMethod. We make a proxy of dependency

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmljdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.xmljdbcConnection = jdbcConnection;
	}
	
}
