package com.m1.livraria.repository;

import com.m1.livraria.entity.HorarioAtendimento;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioAtendimentoRepository extends MongoRepository<HorarioAtendimento, String> {
    List<HorarioAtendimento> findBySetor(String setor);
}
