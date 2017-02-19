package org.gvaireth.springangularintro;

import org.gvaireth.springangularintro.service.InfoService;
import org.gvaireth.springangularintro.service.InfoServiceDev;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevConfiguration {
	@Bean(name = "dev")
	public InfoService getInfoDev() {
		return new InfoServiceDev();
	}

}
