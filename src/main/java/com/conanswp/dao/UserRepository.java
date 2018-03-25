package com.conanswp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conanswp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
}