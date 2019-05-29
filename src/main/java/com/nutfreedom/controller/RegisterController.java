package com.nutfreedom.controller;

import com.nutfreedom.model.Role;
import com.nutfreedom.model.User;
import com.nutfreedom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class RegisterController {

    private final UserService userService;

    @GetMapping("/register")
    public String register() {
        return "auth/register";
    }

    @PostMapping("/register")
    public String save(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "auth/register";
        } else {
            Role role = new Role();
            role.setName("USER");
            role.setRole("ROLE_USER");
            List<Role> roleList = Arrays.asList(role);
            user.setRoles(roleList);
            userService.save(user);
            return "redirect:/";
        }
    }
}
