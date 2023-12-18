package com.dev.backend.controller;

import com.dev.backend.entity.Cidade;
import com.dev.backend.entity.Produto;
import com.dev.backend.service.CidadeService;
import com.dev.backend.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/")
    public List<Produto> buscarTodos(){
        return produtoService.buscarTodos();
    }
    @PostMapping("/")
    public Produto inserir(@RequestBody Produto produto){
        return produtoService.inserir(produto);
    }

    @PutMapping("/")
    public Produto alterar(@RequestBody Produto produto){
        return produtoService.alterar(produto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        produtoService.excluir(id);
        return ResponseEntity.ok().build();
    }


}
