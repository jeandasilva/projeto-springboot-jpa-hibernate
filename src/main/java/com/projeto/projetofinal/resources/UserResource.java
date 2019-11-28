package com.projeto.projetofinal.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.projetofinal.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Jean", "jeangato@gmail.com", "9999599", "naoaguentomais");
		return ResponseEntity.ok().body(u);
	}
}