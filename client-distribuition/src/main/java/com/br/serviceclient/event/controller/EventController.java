package com.br.serviceclient.event.controller;

import com.br.serviceclient.event.service.GeraNovoClienteEventService;
import com.br.serviceclient.request.ClientRequest;
import com.br.serviceclient.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private GeraNovoClienteEventService geraNovoClienteEventService;

    @PostMapping
    public ResponseEntity<?> newClient(@RequestBody(required = true) ClientRequest clientRequest){
        ClienteResponse clienteResponse = geraNovoClienteEventService.execute(clientRequest);
        return ResponseEntity.ok().body(clienteResponse);
    }
}