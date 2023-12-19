package com.dev.backend.controller;


import com.dev.backend.entity.Marca;
import com.dev.backend.entity.Permissao;
import com.dev.backend.service.MarcaService;
import com.dev.backend.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoController {


    @Autowired
    private PermissaoService permissaoService;


    @GetMapping("/")
    public List<Permissao> buscarTodos(){
        return permissaoService.buscarTodos();
    }

    @PostMapping("/")
    public Permissao inserir(@RequestBody Permissao permissao){
        return permissaoService.inserir(permissao);
    }

    @PutMapping("/")
    public Permissao alterar(@RequestBody Permissao permissao){
        return permissaoService.alterar(permissao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        permissaoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}

