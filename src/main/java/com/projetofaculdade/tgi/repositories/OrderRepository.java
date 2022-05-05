package com.projetofaculdade.tgi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofaculdade.tgi.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
