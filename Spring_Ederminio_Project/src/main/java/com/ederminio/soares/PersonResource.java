package com.ederminio.soares;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonResource {

	@Autowired
	private MyRepository rep;

	@GetMapping("people")
	public List<Person> getAllPeople(){
		return (List<Person>) rep.findAll();
	}

	@RequestMapping(value = "person/{id}", method = RequestMethod.GET)
	public Optional<Person> getPerson( @PathVariable int id){		
		return rep.findById(id);
	}

	@RequestMapping(value = "person/{id}", method = RequestMethod.DELETE)
	public String DeletePerson( @PathVariable int id){		
		rep.deleteById(id);
		return "";
	}

	@RequestMapping(value = "person", method = RequestMethod.POST)
	public String AddOrUpadatePerson(@RequestBody Person person){
		System.out.println(person);
		rep.save(person);
		return "inserted";
	}

}
