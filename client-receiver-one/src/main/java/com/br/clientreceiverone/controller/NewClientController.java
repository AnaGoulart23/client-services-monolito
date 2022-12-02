package com.br.clientreceiverone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NewClientController {

    @PostMapping
    public ResponseEntity<?> newClient(@RequestBody Map<String, Object> clienteResponse) {
        System.out.println(clienteResponse.toString());
        return ResponseEntity.ok().body("recebido");
    }
}