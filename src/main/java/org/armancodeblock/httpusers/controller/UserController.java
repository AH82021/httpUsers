package org.armancodeblock.httpusers.controller;

import org.armancodeblock.httpusers.UserHttpClient;
import org.armancodeblock.httpusers.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class UserController {
    private final UserHttpClient client;

    public UserController(UserHttpClient client) {
        this.client = client;
    }


    @GetMapping("")
    public List<User> getAllUsers(){
        return client.getUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        return client.getUserById(id);

    }

}
