package com.kitteless.kittelessfront.controller;

import com.kitteless.kittelessfront.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EntryController {

    @Autowired
    EntryService entryService;

    @PostMapping(value = "/entry")
    public String login(
            @RequestParam String stampCode,
            @RequestParam String image,
            Model model
    ) {
        entryService.entry(stampCode, image);

        return "entry";
    }

    @GetMapping(value = "/entry")
    public String entryRegister(
            Model model
    ) {
        return "entry";
    }
}
