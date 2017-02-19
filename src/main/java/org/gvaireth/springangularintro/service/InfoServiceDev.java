package org.gvaireth.springangularintro.service;

import org.gvaireth.springangularintro.Info;

public class InfoServiceDev implements InfoService {

	@Override
	public Info getInfo() {
		return new Info("Dev profile");
	}
}
