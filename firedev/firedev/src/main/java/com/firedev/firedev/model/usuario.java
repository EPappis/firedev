package com.firedev.firedev.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class usuario  {
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private String senha;

    public usuario() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public usuario(int id, String telefone, String nome, String endereco, String senha) {
        this.id = id;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


}
