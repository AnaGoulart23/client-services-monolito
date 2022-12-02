package com.br.serviceclient.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "service")
public class ServicesDomain {
    private UUID id;
    private String name;
    private String url;

    public void setId(UUID id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public UUID getId() {
        return id;
    }
}