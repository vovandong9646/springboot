package com.example.login.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String view(Model model, Authentication authentication) {


//        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = (UsernamePasswordAuthenticationToken) authentication;
//        CustomUserDetails customUserDetails = (CustomUserDetails) usernamePasswordAuthenticationToken.getPrincipal();
//
//        model.addAttribute("emailLogged", customUserDetails.getUsername());
//        model.addAttribute("authors", customUserDetails.getAuthorities());

        return "home/index";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "home/admin";
    }

    @GetMapping("/sales")
    public String salesPage() {
        return "home/sales";
    }

    @GetMapping("/shipper")
    public String shipperPage() {
        return "home/shipper";
    }
}
