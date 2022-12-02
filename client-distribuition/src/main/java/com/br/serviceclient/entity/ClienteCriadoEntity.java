package com.br.serviceclient.entity;

import com.br.serviceclient.domain.ClienteDomain;
import com.br.serviceclient.response.ClienteResponse;

public class ClienteCriadoEntity extends Entity<ClienteDomain, ClienteResponse> {
    public ClienteCriadoEntity(ClienteDomain entrada) {
        super(entrada);
    }

    public static ClienteCriadoEntity init(ClienteDomain clienteDomain){
        return new ClienteCriadoEntity(clienteDomain);
    }

    @Override
    public ClienteResponse geraSaida() {
        ClienteDomain entrada = this.getEntrada();
        return new ClienteResponse(entrada.getId(),
                entrada.getNome(),
                entrada.getUrlNotification(),
                entrada.getApiKeyNotification(),
                entrada.getApiKey());
    }
}