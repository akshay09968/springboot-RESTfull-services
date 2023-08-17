package coms.RestfulServices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coms.RestfulServices.model.Person;

@RestController
@RequestMapping("/v1/api")
public class PersonController {
	
	@GetMapping("/test")
	public String getValue() {
		return "This is RestAPI Service Application";
	}
	
	@PostMapping("/test")
	public String PrintPersonValues(@RequestBody Person person) {
		System.out.println("Person ID: "+ person.getPid());
		System.out.println("Person Name: "+ person.getPname());
		System.out.println("Person Phonenumber: "+ person.getPhone());
		System.out.println("Person Email ID: "+ person.getEmail());
		return "Done";
	}

	@GetMapping("/test/{id}")
	public String getValue(@PathVariable Integer id) {
		return "This is getMapping with value: " + id;
	}
}

//http://localhost:6969/vi/api/test