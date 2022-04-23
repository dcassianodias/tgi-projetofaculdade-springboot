package com.projetofaculdade.tgi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofaculdade.tgi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
