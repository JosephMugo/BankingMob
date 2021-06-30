package com.example.tacocloud.web;

import com.example.tacocloud.data.UserRepository;
import com.example.tacocloud.security.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    private UserRepository userRepository;

    @Autowired
    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ModelAttribute(name="newUser")
    private Registration registerUser() { return new Registration(); }

    // displays register form defined in the register.html file (or the file that handles registration)
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("newUser", registerUser());
        return "register";
    }

    @PostMapping("/register")
    public String registerForm(@ModelAttribute("newUser") Registration registration) {
        // todo: register validation
        userRepository.save(registration.convertUser());
        return "redirect:/login";
    }
}
