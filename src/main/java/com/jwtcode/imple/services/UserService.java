package com.jwtcode.imple.services;


import com.jwtcode.imple.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Shivansh Malviya", "official.shivansh2001.in@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Sanidhy Jiashwal", "sanidhyjaishwal2001@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"SS Malviya", "shivanshmalviya2001@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"SM Malviya", "official.shivansh2001.in@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }
}
