package com.br.serviceclient.domain;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "cliente")
public class ClienteDomain {
    private UUID id;
    private String nome;
    private String urlNotification;
    private String apiKeyNotification;
    private String apiKey;

    public void setId(UUID id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public UUID getId() {
        return id;
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