package com.rgc.demojwt.Auth;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor//Obligatorio el constructor con todos los argumentos
public class AuthController {

    @PostMapping(value = "login")
    public String login(){

        return "login of endpoint";
    }

    @PostMapping("register")
    public String register(){

        return "register endpoint";
    }
}
