package com.SGV.PGJ.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class IndexCrontroller {
		
	@GetMapping ({"/login","/"})
	public String index() {
						
		return "login";		
	}
	
	

}
