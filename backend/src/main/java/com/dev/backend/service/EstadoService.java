package com.dev.backend.service;

import com.dev.backend.entity.Estado;
import com.dev.backend.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos(){

        return estadoRepository.findAll();
    }

    public Estado inserir(Estado estado){
        estado.setDataCriacao(new Date());
        return estadoRepository.saveAndFlush(estado);
    }

    public Estado alterar(Estado estado){
        estado.setDataAtualizacao(new Date());
        return estadoRepository.saveAndFlush(estado);

    }

    public void excluir(Long id){
        Estado estado = estadoRepository.findById(id).get();
        estadoRepository.delete(estado);
    }
}

