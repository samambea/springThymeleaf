package com.m1.livraria.controller;

import com.m1.livraria.entity.Cliente;
import com.m1.livraria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente novoCliente(@RequestBody Cliente cliente) {
        return clienteService.novoCliente(cliente);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }
}
