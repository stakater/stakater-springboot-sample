package io.aurorasolutions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by hazim on 10/25/16
 */
@EnableWebMvc
public class Controller {
	@Autowired
	Service service;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/test")
	public String test() {
		return service.test();
	}

}
