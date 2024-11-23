package com.unifucamp.unifucamp.controllers;

import com.unifucamp.unifucamp.dto.RequisicaoNovoProduto;
import com.unifucamp.unifucamp.models.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import com.unifucamp.unifucamp.repositories.ProdutosRepository;

@Controller
public class ProdutosController {
    @Autowired
    private ProdutosRepository ProdutosRepository;
    // Endpoint para retornar todos os produtos
    @GetMapping("/api/produtos")
    public List<Produtos> getAllProduto() {
        return ProdutosRepository.findAll();
    }
/* 
    public ProdutosController(ProdutosRepository produtosRepository){
        this.produtosRepository = produtosRepository;
    }
*/
    @GetMapping("/produtos")
    public ModelAndView index() {
        List<Produtos> produto = this.getAllProduto();
        ModelAndView mv = new ModelAndView("produtos/index");
        mv.addObject("produtos", produto);
        return mv;
    }
    @GetMapping("/produtos/novo")
    public String prod_new(){
        return "produtos/novo";
    }
    @PostMapping("/produtos")
    public String criar(RequisicaoNovoProduto requisicao){
        Produtos produto = requisicao.toProdutos();
        this.ProdutosRepository.save(produto);
        return "redirect:/produtos";
    }
    @GetMapping("/produtos/{id}")
    @ResponseBody
    public Produtos getProduto(@PathVariable Integer id) {
        return ProdutosRepository.findById(id).orElse(null);
    }
    @GetMapping("/produtos/{id}/editar")
    public ModelAndView editar(@PathVariable Integer id) {
        Optional<Produtos> optional = this.ProdutosRepository.findById(id);
        if (optional.isPresent()) {
            Produtos produto = optional.get();
            ModelAndView mv = new ModelAndView("produtos/editar");
            mv.addObject("produto", produto);
            return mv;
        } else {
            return new ModelAndView("redirect:/produtos");
        }
    }
    @PostMapping("/produtos/{id}/atualizar")
    public String atualizar(@PathVariable Integer id, RequisicaoNovoProduto requisicao) {
        Optional<Produtos> optional = this.ProdutosRepository.findById(id);
        if (optional.isPresent()) {
            Produtos produto = optional.get();
            produto.setDescricao(requisicao.getDescricao());
            produto.setValor_produto(requisicao.getValor_produto());
            produto.setQtd_estoque_produto(requisicao.getQtd_estoque_produto());
            produto.setCor_produto(requisicao.getCor_produto());
            produto.setDescricao(requisicao.getDescricao());
            produto.setDimensoes_produto(requisicao.getDimensoes_produto());
            produto.setNome_produto(requisicao.getNome_produto());
            produto.setPeso_kg_produto(requisicao.getPeso_kg_produto());
            this.ProdutosRepository.save(produto);
        }
        return "redirect:/produtos";
    }
    @PostMapping("/produtos/{id}/deletar")
    public String deletar(@PathVariable Integer id) {
        Optional<Produtos> optional = this.ProdutosRepository.findById(id);
        if (optional.isPresent()) {
            this.ProdutosRepository.deleteById(id);
        }
        return "redirect:/produtos";
    }


    
}