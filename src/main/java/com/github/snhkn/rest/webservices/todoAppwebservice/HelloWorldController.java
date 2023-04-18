package com.github.snhkn.rest.webservices.todoAppwebservice;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean HelloWorldBean() {
		// throw new RuntimeException("Some error has happened! Contact support at *** -
		// ***");
		return new HelloWorldBean("Hello World");
	}

	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name));
	}
}
