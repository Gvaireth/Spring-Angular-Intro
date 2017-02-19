package org.gvaireth.springangularintro;

import org.gvaireth.springangularintro.service.InfoService;
import org.gvaireth.springangularintro.service.InfoServiceProd;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfiguration {
	@Bean
	public InfoService getInfoProd() {
		return new InfoServiceProd();
	}

}
