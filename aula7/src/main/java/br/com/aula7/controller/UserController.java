package br.com.aula7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula7.entity.User;
import br.com.aula7.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("user")
@CrossOrigin
@Api(value = "user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/list")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(userRepository.findAll());
	}
	
	@ApiOperation(value = "Create new user")
	@PostMapping(value = "/save")
	public ResponseEntity<?> save(@RequestBody User user){
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		return ResponseEntity.ok(userRepository.save(user));
	}
}
