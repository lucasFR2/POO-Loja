package com.unifucamp.unifucamp.dto;

import java.math.BigDecimal;

import com.unifucamp.unifucamp.models.Produtos;

public class RequisicaoNovoProduto {
    private String descricao;
    private String nome_produto;
    private String cor_produto;
    private float peso_kg_produto;
    private String dimensoes_produto;
    private BigDecimal valor_produto;
    private float qtd_estoque_produto;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    public String getCor_produto() {
        return cor_produto;
    }
    public void setCor_produto(String cor_produto) {
        this.cor_produto = cor_produto;
    }
    public float getPeso_kg_produto() {
        return peso_kg_produto;
    }
    public void setPeso_kg_produto(float peso_kg_produto) {
        this.peso_kg_produto = peso_kg_produto;
    }
    public String getDimensoes_produto() {
        return dimensoes_produto;
    }
    public void setDimensoes_produto(String dimensoes_produto) {
        this.dimensoes_produto = dimensoes_produto;
    }
    public BigDecimal getValor_produto() {
        return valor_produto;
    }
    public void setValor_produto(BigDecimal valor_produto) {
        this.valor_produto = valor_produto;
    }
    public float getQtd_estoque_produto() {
        return qtd_estoque_produto;
    }
    public void setQtd_estoque_produto(float qtd_estoque_produto) {
        this.qtd_estoque_produto = qtd_estoque_produto;
    }

    public Produtos toProdutos(){
        Produtos produto = new Produtos();
        produto.setDescricao(descricao);
        produto.setNome_produto(nome_produto);
        produto.setCor_produto(cor_produto);
        produto.setPeso_kg_produto(peso_kg_produto);
        produto.setDimensoes_produto(dimensoes_produto);
        produto.setValor_produto(valor_produto);
        produto.setQtd_estoque_produto(qtd_estoque_produto);
        return produto;
    }
}
