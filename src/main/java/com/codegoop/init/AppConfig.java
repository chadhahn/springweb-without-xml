package com.codegoop.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.codegoop")
public class AppConfig {

//  @Bean
//  public ContentNegotiatingViewResolver contentNegotiatingViewResolver() {
//    final ContentNegotiatingViewResolver viewResolver = new ContentNegotiatingViewResolver();
//    viewResolver.setDefaultContentType(MediaType.APPLICATION_JSON);
//    final List<View> defaultViews = new ArrayList<View>();
//    defaultViews.add(new MappingJacksonJsonView());
//    viewResolver.setDefaultViews(defaultViews);
//    return viewResolver;
//  }
}