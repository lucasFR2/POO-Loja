package com.unifucamp.unifucamp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")

public class Funcionarios {
    @Id
    @Column(nullable=false)
    private String cpf_funcionario;   

    private String data_nasc_funcionario;
    private String nome_funcionario;
    private String sexo_funcionario;
    private String email_funcionario;
    private String rua_funcionario;
    private String num_casa_funcionario;
    private String bairro_funcionario;
    private String cidade_funcionario;
    private String estado_funcionario;
    private String cargo_funcionario;
    private Float salario_funcionario;
    private String senha;

    public String getSenha() {
     return senha;
    }
    public void setSenha(String senha) {
     this.senha = senha;
    }

    public Funcionarios(){ //necessario para o jpa

    }

    public String getCpf_funcionario() {
        return cpf_funcionario;
    }
    public void setCpf_funcionario(String cpf_funcionario) {
        this.cpf_funcionario = cpf_funcionario;
    }
    public String getData_nasc_funcionario() {
        return data_nasc_funcionario;
    }
    public void setData_nasc_funcionario(String data_nasc_funcionario) {
        this.data_nasc_funcionario = data_nasc_funcionario;
    }
    public String getNome_funcionario() {
        return nome_funcionario;
    }
    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }
    public String getSexo_funcionario() {
        return sexo_funcionario;
    }
    public void setSexo_funcionario(String sexo_funcionario) {
        this.sexo_funcionario = sexo_funcionario;
    }
    public String getEmail_funcionario() {
        return email_funcionario;
    }
    public void setEmail_funcionario(String email_funcionario) {
        this.email_funcionario = email_funcionario;
    }
    public String getRua_funcionario() {
        return rua_funcionario;
    }
    public void setRua_funcionario(String rua_funcionario) {
        this.rua_funcionario = rua_funcionario;
    }
    public String getNum_casa_funcionario() {
        return num_casa_funcionario;
    }
    public void setNum_casa_funcionario(String num_casa_funcionario) {
        this.num_casa_funcionario = num_casa_funcionario;
    }
    public String getBairro_funcionario() {
        return bairro_funcionario;
    }
    public void setBairro_funcionario(String bairro_funcionario) {
        this.bairro_funcionario = bairro_funcionario;
    }
    public String getCidade_funcionario() {
        return cidade_funcionario;
    }
    public void setCidade_funcionario(String cidade_funcionario) {
        this.cidade_funcionario = cidade_funcionario;
    }
    public String getEstado_funcionario() {
        return estado_funcionario;
    }
    public void setEstado_funcionario(String estado_funcionario) {
        this.estado_funcionario = estado_funcionario;
    }
    public String getCargo_funcionario() {
        return cargo_funcionario;
    }
    public void setCargo_funcionario(String cargo_funcionario) {
        this.cargo_funcionario = cargo_funcionario;
    }
    public Float getSalario_funcionario() {
        return salario_funcionario;
    }
    public void setSalario_funcionario(Float salario_funcionario) {
        this.salario_funcionario = salario_funcionario;
    }
    public Funcionarios(String cpf_funcionario, String data_nasc_funcionario,
            String nome_funcionario, String sexo_funcionario, String email_funcionario, String rua_funcionario,
            String num_casa_funcionario, String bairro_funcionario, String cidade_funcionario,
            String estado_funcionario, String cargo_funcionario, Float salario_funcionario, String senha) {
        this.cpf_funcionario = cpf_funcionario;
        this.data_nasc_funcionario = data_nasc_funcionario;
        this.nome_funcionario = nome_funcionario;
        this.sexo_funcionario = sexo_funcionario;
        this.email_funcionario = email_funcionario;
        this.rua_funcionario = rua_funcionario;
        this.num_casa_funcionario = num_casa_funcionario;
        this.bairro_funcionario = bairro_funcionario;
        this.cidade_funcionario = cidade_funcionario;
        this.estado_funcionario = estado_funcionario;
        this.cargo_funcionario = cargo_funcionario;
        this.salario_funcionario = salario_funcionario;
        this.senha = senha;
    }


}