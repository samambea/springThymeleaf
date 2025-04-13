package com.m1.livraria.repository;

import com.m1.livraria.entity.Chamado;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ChamadoRepository extends MongoRepository<Chamado, String> {
    List<Chamado> findByStatus(String status);
    
    
}
