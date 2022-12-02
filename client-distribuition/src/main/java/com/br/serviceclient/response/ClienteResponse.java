package com.br.serviceclient.response;

import java.util.UUID;

public class ClienteResponse {
    private UUID id;
    private String nome;
    private String urlNotification;
    private String apiKeyNotification;
    private String apiKey;

    public ClienteResponse(UUID id, String nome,
                           String urlNotification,
                           String apiKeyNotification,
                           String apiKey) {
        this.id = id;
        this.nome = nome;
        this.urlNotification = urlNotification;
        this.apiKeyNotification = apiKeyNotification;
        this.apiKey = apiKey;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlNotification() {
        return urlNotification;
    }

    public void setUrlNotification(String urlNotification) {
        this.urlNotification = urlNotification;
    }

    public String getApiKeyNotification() {
        return apiKeyNotification;
    }

    public void setApiKeyNotification(String apiKeyNotification) {
        this.apiKeyNotification = apiKeyNotification;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}