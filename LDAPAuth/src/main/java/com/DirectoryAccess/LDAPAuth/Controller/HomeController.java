package com.DirectoryAccess.LDAPAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }


    @GetMapping("/about")
    public String indexAbout() {
        return "Welcome to the About page!";
    }



}