package com.br.serviceclient.event.service;


import com.br.serviceclient.response.ClienteResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EnviaParaMSCadastradoService implements Runnable {
    ClienteResponse clienteResponse;

    public EnviaParaMSCadastradoService(ClienteResponse cliente) {
        this.clienteResponse = cliente;
    }

    @Override
    public void run() {
        try {
            String requestBody = prepareRequest();
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(clienteResponse.getUrlNotification()))
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    // .header("Content-Type", "application/json")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            System.out.println(response.body().toString());
            System.out.println(response.statusCode());
        } catch (Throwable e) {
            //erros 500 sao capturados aqui
            // erros 400 ignorados
            e.printStackTrace();
        }
    }

    private String prepareRequest() throws JsonProcessingException {
        Gson gson = new Gson();
        return  gson.toJson(clienteResponse);
    }

}