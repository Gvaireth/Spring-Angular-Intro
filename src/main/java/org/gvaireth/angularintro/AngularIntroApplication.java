package org.gvaireth.angularintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularIntroApplication {

	// run this class as Java Application and check
	// http://localhost:8080/AngularIntro/start

	public static void main(String[] args) {
		SpringApplication.run(AngularIntroApplication.class, args);
		System.out.println("app running");
	}
}
