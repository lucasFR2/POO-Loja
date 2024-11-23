package com.unifucamp.unifucamp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produto;

    @Column(nullable=false)
    private String descricao;

    private String nome_produto;
    private String cor_produto;
    private float peso_kg_produto;
    private String dimensoes_produto;
    private BigDecimal valor_produto;
    private float qtd_estoque_produto;

    // Construtor vazio (necessário para o JPA)
    public Produtos() {
    }

    // Construtor com todos os parâmetros
    public Produtos(int id_produto, String descricao, String nome_produto, String cor_produto, float peso_kg_produto,
            String dimensoes_produto, BigDecimal valor_produto, float qtd_estoque_produto) {
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.nome_produto = nome_produto;
        this.cor_produto = cor_produto;
        this.peso_kg_produto = peso_kg_produto;
        this.dimensoes_produto = dimensoes_produto;
        this.valor_produto = valor_produto;
        this.qtd_estoque_produto = qtd_estoque_produto;
    }

    // Getters e Setters
    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

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
}
