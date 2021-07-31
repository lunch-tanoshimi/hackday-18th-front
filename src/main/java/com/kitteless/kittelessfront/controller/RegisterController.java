package com.kitteless.kittelessfront.controller;

import com.kitteless.kittelessfront.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * アカウント登録
 */
@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;


    @PostMapping(value = "/register")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        // TODO: リクエストでユーザ名とか受け取ったりする

        // TODO: serviceできあがりしだい呼び出す
        registerService.register(username, password);

        // TODO: レスポンスにsetAttributeしたりする
        return "register";
    }

    @GetMapping(value = "/register")
    public String showRegister(
            Model model
    ) {
        // TODO: リクエストでユーザ名とか受け取ったりする

        // TODO: serviceできあがりしだい呼び出す

        // TODO: レスポンスにsetAttributeしたりする
        return "register";
    }
}
