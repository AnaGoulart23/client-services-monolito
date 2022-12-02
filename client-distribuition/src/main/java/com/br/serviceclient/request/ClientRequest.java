package com.br.serviceclient.request;

public class ClientRequest {
    private String nome;
    private String urlNotification;
    private String apiKeyNotification;
    private String apiKey;
    //TODO deve ter uma lista de tipos meios de pagamento e suas chaves?


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