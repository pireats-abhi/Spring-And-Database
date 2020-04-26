package org.ajgroup.config;

import org.ajgroup.dao.StudentDao;
import org.ajgroup.daoImpl.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "org.ajgroup" })
public class WebConfigServlet {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClassName("com.mysql.jdbc.Driver");
		db.setUrl("jdbc:mysql://localhost:3306/demo1");
		db.setUsername("root");
		db.setPassword("2514");
		return db;
	}
	
	@Bean
	public StudentDao getUserDao() {
		return new StudentDaoImpl(getDataSource());
	}

}
