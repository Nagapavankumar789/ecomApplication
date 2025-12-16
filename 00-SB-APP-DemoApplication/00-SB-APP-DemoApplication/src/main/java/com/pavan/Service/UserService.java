package com.pavan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.DTO.UserDTO;
import com.pavan.Entity.Product;
import com.pavan.Entity.User;
import com.pavan.Exception.UserNotFoundException;
import com.pavan.Mapper.UserMapper;
import com.pavan.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	@Autowired
	private UserMapper userMapper;
	
	 // Get User Details from DTO -> Entity
	public UserDTO GetUser(int id) {
		User user = userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User Not Found"));
		return userMapper.toDTO(user);
	}
	
	 // Create User Details from DTO -> Entity
	public UserDTO CreateUser(UserDTO userDTO) {
		List<Product> products = userDTO.getProducts();
		User user = userMapper.toEntity(userDTO);
		 if (user.getProducts() != null) {
		        for (Product product : user.getProducts()) {
		            product.setUser(user);   // ✔ set entity to entity
		        }
		    }
		User saveUser = userRepo.save(user);
		return userMapper.toDTO(saveUser);
		
	}
	 // Update User Details from DTO -> Entity
	public UserDTO UpdateUser( int id, UserDTO userDTO) {	
		User existingUser = userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User Not Found"));
		  userMapper.updateEntityFromDTO(userDTO, existingUser);
	        User updatedUser = userRepo.save(existingUser);
	        return userMapper.toDTO(updatedUser);		
	}
	
	 // Delete User Details from DTO -> Entity
	public void DeleteUser(int id) {
		User user = userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User Not Found"));
		 userRepo.delete(user);
	}
	

}
