package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)// if we set this aa prototype then preDestroy 
                                                 //wont work because IOC container does keep track of prototypes explicitly asked by the user
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbcConnection;// we need different bean whenever we call for the bean of PersonDAO so we put 
											//the annotation ofr ScopedProxyMethod. We make a proxy of dependency

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	
	
}
