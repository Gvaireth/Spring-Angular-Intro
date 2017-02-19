package org.gvaireth.springangularintro.service;

import org.gvaireth.springangularintro.Info;

public class InfoServiceProd implements InfoService {

	@Override
	public Info getInfo() {
		return new Info("Prod profile");
	}

}
