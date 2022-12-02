package com.br.serviceclient.event.service;

import com.br.serviceclient.domain.ClienteDomain;
import com.br.serviceclient.entity.ClienteCriadoEntity;
import com.br.serviceclient.entity.NovoClienteEntity;
import com.br.serviceclient.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalvaNovoClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteCriadoEntity execute(NovoClienteEntity novoClienteEntity) {

        ClienteDomain clienteDomain = clienteRepository.save(novoClienteEntity.geraSaida());
        return ClienteCriadoEntity.init(clienteDomain);
    }
}