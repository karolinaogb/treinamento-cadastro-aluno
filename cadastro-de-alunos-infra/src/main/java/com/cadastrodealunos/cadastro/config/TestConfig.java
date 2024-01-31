package com.cadastrodealunos.cadastro.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cadastrodealunos.cadastro.entities.User;
import com.cadastrodealunos.cadastro.repositories.UserRepository;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null ,"Maria Brown", "556384", "Feminino", "Casada", "04/02/1998", "Null");
		User u2 = new User(null, "Alex Green", "587759", "Masculino", "Solteiro", "21/06/1998", "Null");
	
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	
	}
	
}
