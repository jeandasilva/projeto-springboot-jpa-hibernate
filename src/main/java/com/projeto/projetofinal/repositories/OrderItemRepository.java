package com.projeto.projetofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetofinal.entities.Order;
import com.projeto.projetofinal.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	


}
