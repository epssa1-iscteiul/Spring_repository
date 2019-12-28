package com.ederminio.soares;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonResource 
{

	@Autowired
	private MyRepository rep;

	@Autowired
	private ContactRepository contacts;

	@GetMapping("people")
	public List<Person> getAllPeople( HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("Data request INFO: HOST: "+req.getRemoteHost()+" PROTOCOL:"+req.getProtocol()+
				" Data_Size:"+res.getBufferSize());
		return (List<Person>) rep.findAll();
	}

	@GetMapping("contacts")
	public List<Contact> getContacts()
	{
		return (List<Contact>) contacts.findAll();
	}

	@RequestMapping(value = "person/{id}", method = RequestMethod.GET)
	public Optional<Person> getPerson( @PathVariable int id)
	{		
		return rep.findById(id);
	}


	@RequestMapping(value = "person/{id}", method = RequestMethod.DELETE)
	public String DeletePerson( @PathVariable int id)
	{		
		rep.deleteById(id);
		System.out.println("Person with id="+id+" was deleted");
		return "deleted";
	}


	@RequestMapping(value="person",method = RequestMethod.PUT)
	public String UpdatePerson(@PathVariable int id) 
	{

		return "updated";
	}

	@RequestMapping(value = "person", method = RequestMethod.POST)
	public String AddOrUpadatePerson(@RequestBody Person person)
	{
		System.out.println(person);
		if(!rep.findById(person.getId()).isPresent()) {
			rep.save(person);
			return "inserted";
		}
		
		return "Person with same id already exist";
	}

}
