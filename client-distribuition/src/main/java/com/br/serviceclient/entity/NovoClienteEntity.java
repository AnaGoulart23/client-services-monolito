package com.br.serviceclient.entity;

import com.br.serviceclient.domain.ClienteDomain;
import com.br.serviceclient.request.ClientRequest;
import com.br.serviceclient.response.ClienteResponse;

public class NovoClienteEntity extends Entity<ClientRequest, ClienteDomain> {
    public NovoClienteEntity(ClientRequest entrada) {
        super(entrada);
    }

    public static NovoClienteEntity init(ClientRequest clientRequest){
        return new NovoClienteEntity(clientRequest);
    }
    @Override
    public ClienteDomain geraSaida() {
        ClientRequest entrada = this.getEntrada();
        ClienteDomain clienteDomain = new ClienteDomain();
        clienteDomain.setApiKey(entrada.getApiKey());
        clienteDomain.setNome(entrada.getNome());
        clienteDomain.setApiKeyNotification(entrada.getApiKeyNotification());
        clienteDomain.setUrlNotification(entrada.getUrlNotification());
        return clienteDomain;
    }

}