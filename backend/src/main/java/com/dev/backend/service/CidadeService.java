package com.dev.backend.service;

import com.dev.backend.entity.Cidade;
import com.dev.backend.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;
    public List<Cidade> buscarTodos(){

        return cidadeRepository.findAll();
    }
    public Cidade inserir(Cidade cidade){
        cidade.setDataCriacao(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }
    public Cidade alterar(Cidade cidade){
        cidade.setDataAtualizacao(new Date());
        return cidadeRepository.saveAndFlush(cidade);

    }
    public void excluir(Long id){
        Cidade cidade = cidadeRepository.findById(id).get();
        cidadeRepository.delete(cidade);
    }
}

