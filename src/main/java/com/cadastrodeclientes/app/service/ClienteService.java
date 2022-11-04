package com.cadastrodeclientes.app.service;

import com.cadastrodeclientes.app.model.Cliente;
import com.cadastrodeclientes.app.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.persistir(cliente); //salvar cliente
    }
    public void validarCliente(Cliente cliente){
        //aplicarei validações
    }
}
