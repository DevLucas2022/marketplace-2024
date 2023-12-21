package com.dev.backend.dto;

import com.dev.backend.entity.Cidade;
import com.dev.backend.entity.Pessoa;
import org.springframework.beans.BeanUtils;

public class PessoaClienteRequestDTO {

    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Cidade cidade;
    private String cep;

    public Pessoa converter(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaClienteRequestDTO, pessoa);
        return pessoa;
    }

    public PessoaClienteRequestDTO(String nome, String cpf, String email, String endereco, Cidade cidade, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cep;
    }

    public PessoaClienteRequestDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
