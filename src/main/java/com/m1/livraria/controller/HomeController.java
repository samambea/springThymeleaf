package com.m1.livraria.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.m1.livraria.entity.Cliente;
import com.m1.livraria.entity.Chamado;
import com.m1.livraria.entity.HorarioAtendimento;
import com.m1.livraria.service.ClienteService;
import com.m1.livraria.service.ChamadoService;
import com.m1.livraria.service.HorarioAtendimentoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ChamadoService chamadoService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private HorarioAtendimentoService horarioAtendimentoService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("layout");
        String fragment = "home :: content";
        log.info("Carregando fragmento: {}", fragment); // Log para depuração
        modelAndView.addObject("content", fragment);
        return modelAndView;
    }

    @GetMapping("/chamados")
    public String chamados(Model model) {
        List<Chamado> chamados = chamadoService.listarChamados();
        model.addAttribute("chamados", chamados); // Passa a lista para o modelo
        String fragment = "chamados :: content";
        log.info("Carregando fragmento: {}", fragment); // Log para depuração
        model.addAttribute("content", fragment);
        return "chamados";
    }

    @GetMapping("/clientes")
    public String clientes(Model model) {
        List<Cliente> clientes = clienteService.listarClientes();
        model.addAttribute("clientes", clientes);
        String fragment = "clientes :: content";
        log.info("Carregando fragmento: {}", fragment); // Log para depuração
        model.addAttribute("content", fragment);
        return "clientes";
    }
    
    @GetMapping("/ajustes-horarios")
    public String horarios(Model model) {
        List<HorarioAtendimento> horarios = horarioAtendimentoService.listarTodos();
        model.addAttribute("ajustes-horarios", horarios);
        String fragment = "ajustes-horarios :: content";
        log.info("Carregando fragmento: {}", fragment); // Log para depuração
        model.addAttribute("content", fragment);
        return "ajustes-horarios";
    }

}
