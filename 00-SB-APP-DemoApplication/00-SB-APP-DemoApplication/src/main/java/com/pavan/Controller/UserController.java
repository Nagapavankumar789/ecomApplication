package com.pavan.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pavan.DTO.UserDTO;
import com.pavan.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userServ;

	public UserController(UserService userServ) {
		this.userServ =userServ;
		
	}
	
	@PostMapping("/CreateUser")
	public ResponseEntity<UserDTO> CreateUser(@RequestBody UserDTO userDTO) {
		return ResponseEntity.ok(userServ.CreateUser(userDTO));
	}
	
	@GetMapping("/GetUser/{id}")
	public ResponseEntity<UserDTO> GetUser(@PathVariable int id) {
		return ResponseEntity.ok(userServ.GetUser(id));
	}
	
	@PutMapping("/UpdateUser/{id}")
	public ResponseEntity<UserDTO> UpdateUser(@PathVariable int id , @RequestBody UserDTO userDTO) {
		return ResponseEntity.ok(userServ.UpdateUser(id, userDTO));
	}
	
	@DeleteMapping("/DeleteUser/{id}")
	public ResponseEntity<String> DeleteUser(@PathVariable int id) {
		userServ.DeleteUser(id);
		return ResponseEntity.ok("User deleted successfully with id: " + id);
	}
	

}
