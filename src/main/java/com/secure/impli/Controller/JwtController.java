package com.secure.impli.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.secure.impli.Model.User;
import com.secure.impli.Service.JwtService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/home")
public class JwtController {

    @Autowired
    public JwtService jwtService;

    @GetMapping("/getUsers")
    public List<User> getUser() {
        return jwtService.getusers();
    }
    
    @GetMapping("/current-user")
    public String getLogedInUser(Principal principal) {
        return principal.getName();
    }
    
    
}
