package br.com.canasvieiras.m3s02projetorevisao.services;

import br.com.canasvieiras.m3s02projetorevisao.entities.Categoria;
import br.com.canasvieiras.m3s02projetorevisao.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    //salvar, buscar, apagar

    public Categoria salvar(Categoria categoria) throws Exception {

        Categoria categoriaBanco = null;
        if (categoria.getId() != null){
            categoriaBanco = buscarPorId(categoria.getId());
        }


        categoria.setAtualizacao(new Date());

        if (categoria.getNome() == null || categoria.getNome().isEmpty()) {
            throw new Exception("Nome é obrigatório");
        }

        categoriaBanco.setAtualizacao(categoria.getAtualizacao());
        categoriaBanco.setNome(categoria.getNome());
        categoriaBanco.setDescricao(categoria.getDescricao());

        categoriaBanco = categoriaRepository.save(categoriaBanco);
        return categoriaBanco;

    }

    public List<Categoria> buscarTodos() {

        return categoriaRepository.findAll();

    }

    public Categoria buscarPorId(Long id) throws Exception{


        Optional <Categoria> categoriaOptional = categoriaRepository.findById(id);

        if (categoriaOptional.isEmpty()){
            throw new Exception("Categoria não encontrada!");
        }

        return categoriaOptional.get();

    }

    public boolean apagar(Long id) {

        Optional <Categoria> categoriaOptional = categoriaRepository.findById(id);

        if (categoriaOptional.isEmpty()){
            return false;
        }

        categoriaRepository.delete(categoriaOptional.get());
        return true;
    }
}
