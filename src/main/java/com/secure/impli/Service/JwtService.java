package com.secure.impli.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.secure.impli.Model.User;

@Service
public class JwtService {

    List<User> store = new ArrayList<>();

    public JwtService(){
        store.add(new User("Sur",UUID.randomUUID().toString(),"abc@gmail.com"));
    }

    public List<User> getusers(){
        return this.store;
    }
    
}
