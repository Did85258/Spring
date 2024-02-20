package soa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.dao.PersonDAO;
import soa.model.Person;

@RestController
@RequestMapping("/persons")
public class PersonService {

	@Autowired
	private PersonDAO personDAO ;
	
	
	/*@GetMapping("/{name}")   // --> persons/name
	public String hello(@PathVariable("name")String s) {
		return s ;
	}*/
	
	@GetMapping("/")
	public List<Person> findAll() {
		
		/*List<Person> persons = new ArrayList<Person>();
		Person p = new Person(1,"Test") ;
		persons.add(p);*/
		return personDAO.findAll() ;
		
	}
	
	
	@GetMapping("/{id}")
	public Person findByID(@PathVariable("id")int i) {
		
		/*List<Person> persons = new ArrayList<Person>();
		Person p = new Person(1,"Test") ;
		persons.add(p);*/
		return personDAO.findByID(i) ;
		
	}
}
