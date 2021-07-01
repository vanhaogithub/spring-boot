package com.bachkhoa.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bachkhoa.dto.UserRegistrationDto;
import com.bachkhoa.entities.User;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}