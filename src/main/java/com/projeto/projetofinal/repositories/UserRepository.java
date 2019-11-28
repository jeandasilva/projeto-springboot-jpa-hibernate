package com.projeto.projetofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetofinal.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	


}
