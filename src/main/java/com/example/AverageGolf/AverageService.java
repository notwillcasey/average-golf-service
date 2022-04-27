package com.example.AverageGolf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AverageService {
	
	@GetMapping("/distances")
	public String AverageDistance(@RequestParam(value = "Distances", defaultValue = "you suck at golf") String distances) {
		return distances;
	}
	

}
