package com.bit.spring08.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
 	<!-- Enables the Spring MVC @Controller programming model -->

	

	
	
 */

//<annotation-driven />
@EnableWebMvc
// <context:component-scan base-package="com.bit.spring08" />
@ComponentScan(basePackages = {"com.bit.spring08"})
public class ServletConfig implements WebMvcConfigurer{
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
//		<!-- Handles HTTP GET requests for /resources/** by efficiently serving up static resources in the ${webappRoot}/resources directory -->
//		<resources mapping="/resources/**" location="/resources/" />
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
//		<beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//			<beans:property name="prefix" value="/WEB-INF/views/" />
//			<beans:property name="suffix" value=".jsp" />
//		</beans:bean>
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		registry.viewResolver(viewResolver);
	}

}
