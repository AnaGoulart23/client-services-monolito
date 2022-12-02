package com.br.serviceclient.event.service;

import com.br.serviceclient.entity.ClienteCriadoEntity;
import com.br.serviceclient.entity.NovoClienteEntity;
import com.br.serviceclient.request.ClientRequest;
import com.br.serviceclient.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeraNovoClienteEventService {
    @Autowired
    private SalvaNovoClienteService salvaNovoClienteService;

    public ClienteResponse execute(ClientRequest clientRequest) {
        NovoClienteEntity novoClienteEntity = NovoClienteEntity.init(clientRequest);
        ClienteCriadoEntity clienteCriadoEntity = salvaNovoClienteService.execute(novoClienteEntity);
        new Thread(new EnviaParaMSCadastradoService(clienteCriadoEntity.geraSaida())).start();
        //abre nova thread para enviar aos plugados espera cada um deles responder e salva o retorno
        return clienteCriadoEntity.geraSaida();
    }

}