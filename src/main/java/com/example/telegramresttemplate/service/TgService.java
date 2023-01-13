package com.example.telegramresttemplate.service;

import com.example.telegramresttemplate.dto.RestDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Service
public class TgService {


    private Long offsetGlobal = null;

    public ResponseEntity tgBotMessage() {

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api.telegram.org/bot5863331540:AAET48i8x26oo3s_ReVjSgXszsYfyqAgwMc/getUpdates?offset={offset}";

        Map<String, String> params = new HashMap<>();
        params.put("offset", String.valueOf(offsetGlobal));

        ResponseEntity<RestDTO> exchange = restTemplate.exchange(url, HttpMethod.GET, null,
                RestDTO.class, params);

        if (exchange.getBody().result.size() > 0) {
            offsetGlobal = (long) (exchange.getBody().result.get(0).update_id + 1);
        }
        System.out.println("No Messages");


        return new ResponseEntity<>(exchange.getBody(), HttpStatus.OK);
    }
}
