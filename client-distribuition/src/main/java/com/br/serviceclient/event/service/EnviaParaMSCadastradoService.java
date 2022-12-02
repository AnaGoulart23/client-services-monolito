package com.br.serviceclient.event.service;


import com.br.serviceclient.response.ClienteResponse;
import coresearch.cvurl.io.model.Response;
import coresearch.cvurl.io.request.CVurl;

import javax.xml.transform.Result;
import java.util.Map;

public class EnviaParaMSCadastradoService implements Runnable {
    ClienteResponse clienteResponse;

    public EnviaParaMSCadastradoService(ClienteResponse cliente) {
        this.clienteResponse = cliente;
    }

    @Override
    public void run() {
        CVurl cVurl = new CVurl();
        Response<String> msOne = cVurl.post("http://localhost:8160/service-receiver-one/")
                .body("")
                .asString()
                .orElseThrow(RuntimeException::new);
        System.out.println(msOne.getBody());

    }


}