package br.com.canasvieiras.m3s02projetorevisao.repositories;

import br.com.canasvieiras.m3s02projetorevisao.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

//informar o tipo de Classe(Categoria) e o tipo de dado do Id(Long)
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {



}
