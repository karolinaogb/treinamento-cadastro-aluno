package com.cadastrodealunos.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastrodealunos.cadastro.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
