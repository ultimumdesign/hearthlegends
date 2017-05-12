package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
	@GetMapping(path="ping")
	public String getMe(){
		return "pong";
	}
	
	@GetMapping
	public String getMeTwo(){
		return "Deeze";
	}

}
