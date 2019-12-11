package com.projeto.projetofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetofinal.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	


}
