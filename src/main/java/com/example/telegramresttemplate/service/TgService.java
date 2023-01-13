package com.example.telegramresttemplate.service;

import com.example.telegramresttemplate.dto.RestDTO;
import com.sun.net.httpserver.Authenticator;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.naming.spi.DirStateFactory;
import java.util.HashMap;
import java.util.Map;


@Service
public class TgService {



    public ResponseEntity tgBotMessage(String offset){

        RestTemplate restTemplate = new RestTemplate();

        String url="https://api.telegram.org/bot5863331540:AAET48i8x26oo3s_ReVjSgXszsYfyqAgwMc/getUpdates";
//                "?offset={offset}";
//        RestDTO forObject = restTemplate.getForObject("https://api.telegram.org/bot5863331540:AAET48i8x26oo3s_ReVjSgXszsYfyqAgwMc/getUpdates",
//                RestDTO.class);
        Map <String , String> params = new HashMap<>();
        params.put("offset",offset);








        ResponseEntity<RestDTO> exchange = restTemplate.exchange(url, HttpMethod.GET, null, RestDTO.class);

        System.out.println(exchange.getBody().result);
        return new  ResponseEntity<>(exchange.getBody(), HttpStatus.OK);

//        return new ResponseEntity<>(forObject, HttpStatus.OK);


    }
}
