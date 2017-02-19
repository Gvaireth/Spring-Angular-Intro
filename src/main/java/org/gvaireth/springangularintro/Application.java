package org.gvaireth.springangularintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

//@ComponentScan({ "org.gvaireth.springangularintro", "org.gvaireth.springangularintro.service",
//	"org.gvaireth.springangularintro.web" })
@Configuration
@SpringBootApplication
public class Application {

	// run this class as Java Application and check
	// http://localhost:8080/SpringAngularIntro/start

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("app running");
	}

}
