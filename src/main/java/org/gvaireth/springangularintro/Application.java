package org.gvaireth.springangularintro;

import org.gvaireth.springangularintro.service.InfoService;
import org.gvaireth.springangularintro.service.InfoServiceDev;
import org.gvaireth.springangularintro.service.InfoServiceProd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@EnableAutoConfiguration
@ComponentScan({ "org.gvaireth.springangularintro.service", "org.gvaireth.springangularintro.web" })
@Configuration
@SpringBootApplication
public class Application {

	// run this class as Java Application and check
	// http://localhost:8080/SpringAngularIntro/start

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("app running");
	}

	@Bean(name = "dev")
	public InfoService getInfoDev() {
		return new InfoServiceDev();
	}

	// @Bean(name = "prod")
	public InfoService getInfoProd() {
		return new InfoServiceProd();
	}

}
