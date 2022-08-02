package com.waiyanhtet.config;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		DispatcherServlet dispatcher = new DispatcherServlet();
		dispatcher.setContextConfigLocation("/WEB-INF/servlet-config.xml");
		
		var servlet = ctx.addServlet("dispatcher", dispatcher);
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		
		ctx.setInitParameter("contextConfigLocation", "/WEB-INF/root-config.xml");		
		var contextLoader = new ContextLoaderListener();
		ctx.addListener(contextLoader);
	}


}
