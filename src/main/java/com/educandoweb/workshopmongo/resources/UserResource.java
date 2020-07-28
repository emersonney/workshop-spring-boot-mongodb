package com.educandoweb.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.workshopmongo.domain.User;
import com.educandoweb.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		/*
		 * User emerson = new User("1", "Emerson Teste", "emersonteste@gmail.com"); User
		 * maria = new User("2","Maria Silva","maria@gmail.com"); User alex = new
		 * User("3","Alex Green","alex@gmail.com"); List<User> list = new ArrayList<>();
		 * list.addAll(Arrays.asList(emerson, maria, alex));
		 */
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
