package com.bachkhoa.controller.user;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("hasAnyAuthority('ROLE_NORMAL','ROLE_ADMIN')")
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping( value="/test", method = RequestMethod.GET )
    public String test1() {
        return "ROLE_NORMAL /user";
    }

}
