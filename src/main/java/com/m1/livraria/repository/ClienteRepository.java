package com.m1.livraria.repository;

import com.m1.livraria.entity.Cliente;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    List<Cliente> findByNome(String nome);
}
