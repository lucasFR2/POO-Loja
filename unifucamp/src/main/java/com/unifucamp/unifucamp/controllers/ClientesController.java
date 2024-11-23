package com.unifucamp.unifucamp.controllers;
 
import com.unifucamp.unifucamp.dto.RequisicaoNovoCliente;
import com.unifucamp.unifucamp.models.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import java.util.List;
import java.util.Optional;

import com.unifucamp.unifucamp.repositories.ClientesRepository;

@Controller
public class ClientesController {
    @Autowired
    private ClientesRepository ClientesRepository;
    // Endpoint para retornar todos os produtos
    @GetMapping("/api/clientes") 
    public List<Clientes> getAllCliente() {
        return ClientesRepository.findAll();
    }
/* 
    public ClientesController(ClientesRepository clientesRepository){
        this.clientesRepository = clientesRepository;
    }
*/
    @GetMapping("/clientes")
    public ModelAndView index() {
        List<Clientes> cliente = this.getAllCliente();
        ModelAndView mv = new ModelAndView("clientes/index");
        mv.addObject("clientes", cliente);
        return mv;
    }

    @GetMapping("/clientes/novo")
    public String client_new() {
        return "clientes/novo";
    }
    
    @PostMapping("/clientes")
    public String adicionar(RequisicaoNovoCliente requisicao) {
        Clientes cliente = requisicao.toClientes();
        this.ClientesRepository.save(cliente);
        return "redirect:/clientes";
    }
    @GetMapping("/clientes/{id}")
    @ResponseBody
    public Clientes getCliente(@PathVariable String id){
        return ClientesRepository.findById(id).orElse(null);
    }
    @GetMapping("/clientes/{id}/editar")
    public ModelAndView editar(@PathVariable String id) {
        Optional<Clientes> optional = this.ClientesRepository.findById(id);
        if (optional.isPresent()) {
            Clientes cliente = optional.get();
            ModelAndView mv = new ModelAndView("clientes/editar");
            mv.addObject("cliente", cliente);
            return mv;
        } else {
            return new ModelAndView("redirect:/clientes");
        }
    }
    @PostMapping("/clientes/{id}/atualizar")
    public String atualizar(@PathVariable String id, RequisicaoNovoCliente requisicao) {
        Optional<Clientes> optional = this.ClientesRepository.findById(id);
        if (optional.isPresent()) {
            Clientes cliente = optional.get();
            cliente.setNome_cliente(requisicao.getNome_cliente());
            cliente.setSexo_cliente(requisicao.getSexo_cliente());
            cliente.setEmail_cliente(requisicao.getEmail_cliente());
            cliente.setRua_cliente(requisicao.getRua_cliente());
            cliente.setBairro_cliente(requisicao.getBairro_cliente());
            cliente.setCidade_cliente(requisicao.getCidade_cliente());
            this.ClientesRepository.save(cliente);
        }
        return "redirect:/clientes";
    }
    @PostMapping("/clientes/{id}/deletar")
    public String deletar(@PathVariable String id) {
        Optional<Clientes> optional = this.ClientesRepository.findById(id);
        if (optional.isPresent()) {
            this.ClientesRepository.deleteById(id);
        }
        return "redirect:/clientes";
    }
}