package org.gvaireth.springangularintro.service;

import org.gvaireth.springangularintro.Info;
import org.springframework.stereotype.Service;

@Service("prod")
public class InfoServiceProd implements InfoService {

	@Override
	public Info getInfo() {
		return new Info("Prod profile");
	}
}
