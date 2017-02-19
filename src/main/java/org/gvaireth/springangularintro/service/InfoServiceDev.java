package org.gvaireth.springangularintro.service;

import org.gvaireth.springangularintro.Info;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class InfoServiceDev implements InfoService {

	@Override
	public Info getInfo() {
		return new Info("Dev profile");
	}
}
