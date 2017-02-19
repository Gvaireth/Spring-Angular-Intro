package org.gvaireth.springangularintro.service;

import org.gvaireth.springangularintro.Info;
import org.springframework.stereotype.Service;

@Service("dev")
public class InfoServiceDev implements InfoService {

	@Override
	public Info getInfo() {
		return new Info("Dev profile");
	}
}
