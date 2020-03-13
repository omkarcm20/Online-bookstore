package com.omkar.onlinebookstore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.omkar.onlinebookstore.entity.Book;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {	

	
	
	//by default id is not show in url as it is primary key ;therefore this class is used to config what is to be shown
	//By entity manager we can directly automatically show ids
@Override
public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	config.exposeIdsFor(Book.class);
}
}
