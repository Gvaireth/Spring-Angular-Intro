package org.gvaireth.springangularintro;

import org.gvaireth.springangularintro.service.InfoService;
import org.gvaireth.springangularintro.service.InfoServiceDev;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfiguration {
	@Bean
	public InfoService getInfoDev() {
		return new InfoServiceDev();
	}
}
