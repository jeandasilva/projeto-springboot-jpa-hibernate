package com.projeto.projetofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetofinal.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	


}
