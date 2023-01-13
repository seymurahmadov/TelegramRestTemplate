package com.example.telegramresttemplate.controller;

import com.example.telegramresttemplate.service.TgService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class TgControl {

    private final TgService tgService;

    @GetMapping("tgBot")
    public ResponseEntity tgBot(@RequestParam String offset){
        return tgService.tgBotMessage(offset);
    }



}
