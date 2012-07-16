package com.codegoop.init;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.WebApplicationInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class AppInit implements WebApplicationInitializer {
	@Override
	public void onStartup(final ServletContext servletCtx) throws ServletException {
		final AnnotationConfigWebApplicationContext appCtx = new AnnotationConfigWebApplicationContext();
		appCtx.register(AppConfig.class);
		servletCtx.addServlet("dispatcher", new DispatcherServlet(appCtx)).addMapping("/*");
	}
}