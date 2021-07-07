package com.bachkhoa.service;

import com.bachkhoa.model.entity.User;

public interface AuthService {

    User register( User userToAdd );
    String login( String username, String password );
}
