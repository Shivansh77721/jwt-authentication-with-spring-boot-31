package com.jwtcode.imple.Controllers;


import com.jwtcode.imple.models.User;
import com.jwtcode.imple.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    private UserService userService;

    // http:/localhost:8082/home/users
    @GetMapping("/users")
    public List<User> getUser() {
        System.out.println("Getting Users");
        return userService.getUser();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
