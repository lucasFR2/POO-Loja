package com.unifucamp.unifucamp.controllers;
 
import com.unifucamp.unifucamp.dto.RequisicaoNovoFuncionario;
import com.unifucamp.unifucamp.models.Funcionarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


import java.util.List;
import java.util.Optional;

import com.unifucamp.unifucamp.repositories.FuncionariosRepository;

@Controller
public class FuncionariosController {
    @Autowired
    private FuncionariosRepository FuncionariosRepository;
    // Endpoint para retornar todos os produtos
    @GetMapping("/api/funcionarios")
    public List<Funcionarios> getAllFuncionario() {
        return FuncionariosRepository.findAll();
    }
/* 
    public FuncionariosController(FuncionariosRepository FunciariosRepository){
        this.FuncionariosRepository = funcionariosRepository;
    }
*/
    @GetMapping("/funcionarios")
    public ModelAndView index() {
        List<Funcionarios> funcionario = this.getAllFuncionario();
        ModelAndView mv = new ModelAndView("funcionarios/index");
        mv.addObject("funcionarios", funcionario);
        return mv;
    }
    @GetMapping("/funcionarios/novo")
    public String funcionario_new(Model model){
        model.addAttribute("funcionario", new RequisicaoNovoFuncionario());
        return "funcionarios/novo";
    }
    
    @PostMapping("/funcionarios")
    public String criar(RequisicaoNovoFuncionario requisicao){
        Funcionarios funcionario = requisicao.toFuncionarios();
        this.FuncionariosRepository.save(funcionario);
        return "redirect:/funcionarios";
    }
    @GetMapping("/funcionarios/{id}")
    @ResponseBody
    public Funcionarios getFuncionario(@PathVariable String id){
        return FuncionariosRepository.findById(id).orElse(null);
    }

    @GetMapping("/funcionarios/{id}/editar")
    public ModelAndView editar(@PathVariable String id) {
        Optional<Funcionarios> optional = this.FuncionariosRepository.findById(id);
        if (optional.isPresent()) {
            Funcionarios funcionario = optional.get();
            ModelAndView mv = new ModelAndView("funcionarios/editar");
            mv.addObject("funcionario", funcionario);
            return mv;
        } else {
            return new ModelAndView("redirect:/funcionarios");
        }
    }
    

    @PostMapping("/funcionarios/{id}/atualizar")
    public String atualizar(@PathVariable String id, RequisicaoNovoFuncionario requisicao){
        Optional<Funcionarios> optional = this.FuncionariosRepository.findById(id);
        if (optional.isPresent()){
            Funcionarios funcionario = optional.get();
            funcionario.setNome_funcionario(requisicao.getNome_funcionario());
            funcionario.setSexo_funcionario(requisicao.getSexo_funcionario());
            funcionario.setEmail_funcionario(requisicao.getEmail_funcionario());
            funcionario.setRua_funcionario(requisicao.getRua_funcionario());
            funcionario.setNum_casa_funcionario(requisicao.getNum_casa_funcionario());
            funcionario.setBairro_funcionario(requisicao.getBairro_funcionario());
            funcionario.setCidade_funcionario(requisicao.getCidade_funcionario());
            funcionario.setEstado_funcionario(requisicao.getEstado_funcionario());
            funcionario.setCargo_funcionario(requisicao.getCargo_funcionario());
            funcionario.setSalario_funcionario(requisicao.getSalario_funcionario());
            funcionario.setSenha(requisicao.getSenha());
            this.FuncionariosRepository.save(funcionario);
        }
        return "redirect:/funcionarios";
    }

    @PostMapping("/funcionarios/{id}/deletar")
    public String deletar(@PathVariable String id){
        Optional<Funcionarios> optional = this.FuncionariosRepository.findById(id);
        if(optional.isPresent()){
            this.FuncionariosRepository.deleteById(id);
        }
        return "redirect:/funcionarios";
    }
}