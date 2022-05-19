package com.projetofaculdade.tgi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofaculdade.tgi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
