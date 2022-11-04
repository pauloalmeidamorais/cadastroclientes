package com.cadastrodeclientes.app.service;

import com.cadastrodeclientes.app.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
    }
    public void validarCliente(Cliente cliente){
        //aplicarei validações
    }
}
