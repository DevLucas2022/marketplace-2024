package com.dev.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    @CPF(message = "Coloque um CPF válido, por favor.")
    private String cpf;

    @Email(message = "Coloque um email válido, por favor.")
    private String email;
    private String senha;
    private String endereco;
    private String cep;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
    @ManyToOne
    @JoinColumn(name = "idCidade")
    private Cidade cidade;

    @OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    //@Setter(value = AccessLevel.NONE)
    private List<PermissaoPessoa> permissaoPessoas;



    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String cpf, String email, String senha, String endereco, String cep, Date dataCriacao, Date dataAtualizacao, Cidade cidade, List<PermissaoPessoa> permissaoPessoas) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.cep = cep;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.cidade = cidade;
        this.permissaoPessoas = permissaoPessoas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPermissaoPessoas(List<PermissaoPessoa> pp){
        for(PermissaoPessoa p:pp){
            p.setPessoa(this);
        }
        this.permissaoPessoas = pp;
    }

    public List<PermissaoPessoa> getPermissaoPessoas() {
        return permissaoPessoas;
    }
}
