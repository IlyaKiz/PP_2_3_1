package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import web.models.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {


    List<User> listUsers = new ArrayList<>();

    public List<User> listUsers() {
        listUsers.add(new User("User1", "Lastname1", "user1@mail.ru"));
        listUsers.add(new User("User2", "Lastname2", "user2@mail.ru"));
        listUsers.add(new User("User3", "Lastname3", "user3@mail.ru"));
        listUsers.add(new User("User4", "Lastname4", "user4@mail.ru"));
        return listUsers;
    }

    @GetMapping(value = "/users")
    public String getUsers(ModelMap model) {

        model.addAttribute("listUsers", listUsers());

        return "users";
    }



}
