package com.example.telegramresttemplate.controller;

import com.example.telegramresttemplate.service.TgService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TelegramController {

    private final TgService tgService;

    @GetMapping("tgBot")
    public ResponseEntity tgBot(){
        return tgService.tgBotMessage();
    }


}
