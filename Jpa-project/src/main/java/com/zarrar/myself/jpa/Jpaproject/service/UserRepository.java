package com.zarrar.myself.jpa.Jpaproject.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zarrar.myself.jpa.Jpaproject.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
