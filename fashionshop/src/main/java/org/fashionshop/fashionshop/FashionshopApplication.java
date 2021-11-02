package org.fashionshop.fashionshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
/**
 * The @RestController annotation tells Spring that this code describes an endpoint that should be made
 * available over the web.
 */
@RestController
public class FashionshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FashionshopApplication.class, args);
	}

	/**
	 The @GetMapping(“/hello”) tells Spring to use our hello() method to answer requests that get sent
	 to the http://localhost:8080/hello address.
	 */
	/*
	the @RequestParam is telling Spring to expect a name value in the request, but if it’s not there,
	it will use the word “World” by default.
	 */
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue = "World")String name){
		return String.format("Hello %s!", name);
	}
}
