package com.practice.knowledge.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.knowledge.Registory.ServiceRegistory;

@Configuration
public class AppConfig {

	@Bean
	public FactoryBean<?> getServiceRegistory()
	{
		final ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(ServiceRegistory.class);
		return bean;
	}
}
