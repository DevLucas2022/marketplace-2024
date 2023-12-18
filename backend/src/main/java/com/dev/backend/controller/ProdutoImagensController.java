package com.dev.backend.controller;


import com.dev.backend.entity.Categoria;
import com.dev.backend.entity.ProdutoImagens;
import com.dev.backend.service.CategoriaService;
import com.dev.backend.service.ProdutoImagensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/produtoImagens")
public class ProdutoImagensController {

    @Autowired
    private ProdutoImagensService produtoImagensService;

    @GetMapping("/")
    public List<ProdutoImagens> buscarTodos(){
        return produtoImagensService.buscarTodos();
    }

    @PostMapping("/")
    public ProdutoImagens inserir(@RequestParam("idProduto") Long idProduto, @RequestParam("file") MultipartFile file ){
        return produtoImagensService.inserir(idProduto,file);
    }
    @PutMapping("/")
    public ProdutoImagens alterar(@RequestBody ProdutoImagens objeto){
        return produtoImagensService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        produtoImagensService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
