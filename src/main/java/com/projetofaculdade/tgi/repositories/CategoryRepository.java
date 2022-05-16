package com.projetofaculdade.tgi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofaculdade.tgi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
