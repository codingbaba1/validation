package com.valid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.dto.UserDTO;
import com.valid.entity.User;
import com.valid.exception.UserNotFoundException;
import com.valid.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(UserDTO userDTO)// sending the proxy as parameter but we are returning the original
	{
		// DTO to Entity
		// Entity to DTO

		User user = User.builder().name(userDTO.getName()).email(userDTO.getEmail()).mobile(userDTO.getMobile())
				.age(userDTO.getAge()).build();
		return userRepository.save(user);

	}

	public User getUserById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException("No user present with ID " + id));
	}

}
