package com.produtos.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.produtos.apirest.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
