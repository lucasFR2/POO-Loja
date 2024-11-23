package com.unifucamp.unifucamp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {
    @Id
    private String cpf_cliente;

    @Column(nullable=false)
    private String data_nasc_cliente;
    private String nome_cliente;
    private String sexo_cliente;
    private String email_cliente;
    private String rua_cliente;
    private String num_casa_cliente;
    private String bairro_cliente;
    private String cidade_cliente;

    public Clientes(){//necessario para o jpa

    }
    
    public Clientes(String cpf_cliente , String data_nasc_cliente, String nome_cliente, String sexo_cliente,
            String email_cliente, String rua_cliente, String num_casa_cliente, String bairro_cliente,
            String cidade_cliente, String estado_cliente) {
        this.cpf_cliente  = cpf_cliente ;
        this.data_nasc_cliente = data_nasc_cliente;
        this.nome_cliente = nome_cliente;
        this.sexo_cliente = sexo_cliente;
        this.email_cliente = email_cliente;
        this.rua_cliente = rua_cliente;
        this.num_casa_cliente = num_casa_cliente;
        this.bairro_cliente = bairro_cliente;
        this.cidade_cliente = cidade_cliente;
        this.estado_cliente = estado_cliente;
    }
    public String getCpf_cliente() {
        return cpf_cliente ;
    }
    public void setCpf_cliente(String cpf_cliente ) {
        this.cpf_cliente  = cpf_cliente ;
    }
    public String getData_nasc_cliente() {
        return data_nasc_cliente;
    }
    public void setData_nasc_cliente(String data_nasc_cliente) {
        this.data_nasc_cliente = data_nasc_cliente;
    }
    public String getNome_cliente() {
        return nome_cliente;
    }
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public String getSexo_cliente() {
        return sexo_cliente;
    }
    public void setSexo_cliente(String sexo_cliente) {
        this.sexo_cliente = sexo_cliente;
    }
    public String getEmail_cliente() {
        return email_cliente;
    }
    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
    public String getRua_cliente() {
        return rua_cliente;
    }
    public void setRua_cliente(String rua_cliente) {
        this.rua_cliente = rua_cliente;
    }
    public String getNum_casa_cliente() {
        return num_casa_cliente;
    }
    public void setNum_casa_cliente(String num_casa_cliente) {
        this.num_casa_cliente = num_casa_cliente;
    }
    public String getBairro_cliente() {
        return bairro_cliente;
    }
    public void setBairro_cliente(String bairro_cliente) {
        this.bairro_cliente = bairro_cliente;
    }
    public String getCidade_cliente() {
        return cidade_cliente;
    }
    public void setCidade_cliente(String cidade_cliente) {
        this.cidade_cliente = cidade_cliente;
    }
    public String getEstado_cliente() {
        return estado_cliente;
    }
    public void setEstado_cliente(String estado_cliente) {
        this.estado_cliente = estado_cliente;
    }
    private String estado_cliente; 
}