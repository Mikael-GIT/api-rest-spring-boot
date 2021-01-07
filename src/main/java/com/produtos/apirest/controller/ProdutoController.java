package com.produtos.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repositories.ProdutoRepository;

@RestController
@RequestMapping(path="/produtos")
public class ProdutoController {
	private ProdutoRepository produtoRepository;
	
	public ProdutoController(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}
	
	@PostMapping
	public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
		produtoRepository.save(produto);
		return new ResponseEntity<>(produto, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> buscarTodos(){
		List <Produto> produtos = new ArrayList<>();
		produtos = produtoRepository.findAll();
		return new ResponseEntity<>(produtos, HttpStatus.OK);
	}
}
