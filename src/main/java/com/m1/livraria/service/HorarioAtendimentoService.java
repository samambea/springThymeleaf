package com.m1.livraria.service;

import com.m1.livraria.entity.HorarioAtendimento;
import com.m1.livraria.repository.HorarioAtendimentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioAtendimentoService {

    @Autowired
    private HorarioAtendimentoRepository horarioAtendimentoRepository;

    public List<HorarioAtendimento> listarTodos() {
        return horarioAtendimentoRepository.findAll();
    }

    public List<HorarioAtendimento> listarPorSetor(String setor) {
        return horarioAtendimentoRepository.findBySetor(setor);
    }

    public HorarioAtendimento salvar(HorarioAtendimento horarioAtendimento) {
        return horarioAtendimentoRepository.save(horarioAtendimento);
    }

    public void deletar(String id) {
        horarioAtendimentoRepository.deleteById(id);
    }
}
