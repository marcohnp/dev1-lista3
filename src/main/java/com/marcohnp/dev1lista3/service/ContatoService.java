package com.marcohnp.dev1lista3.service;

import com.marcohnp.dev1lista3.entity.ContatoEntity;
import com.marcohnp.dev1lista3.expection.exceptions.ContatoNotFoundException;
import com.marcohnp.dev1lista3.mapper.ContatoMapper;
import com.marcohnp.dev1lista3.model.ContatoModel;
import com.marcohnp.dev1lista3.model.request.ContatoRequest;
import com.marcohnp.dev1lista3.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public List<ContatoModel> listar() {
        return repository.findAll().stream().map(ContatoMapper::mapEntityToModel).collect(Collectors.toList());
    }

    public ContatoModel recuperar(Integer id) {
        return ContatoMapper.mapEntityToModel(repository.findById(id).orElseThrow(
                () -> new ContatoNotFoundException("Contato não encontrado.")));
    }

    public ContatoModel inserir(ContatoModel request) {
        return ContatoMapper.mapEntityToModel(repository.save(ContatoMapper.mapModelToEntity(request)));
    }

    public ContatoModel atualizar(Integer id, ContatoModel model) {
        var entity = (repository.findById(id).orElseThrow(
                ContatoNotFoundException::new));
        atualizaLivro(model, entity);
        return ContatoMapper.mapEntityToModel(repository.save(entity));
    }

    private void atualizaLivro(ContatoModel model, ContatoEntity entity) {
        entity.setNomeCompleto(model.getNomeCompleto());
        entity.setTelefone(model.getNomeCompleto());
    }

    public void apagar(Integer id) {
        repository.findById(id).orElseThrow(() -> new ContatoNotFoundException("Contato não encontrado."));
        repository.deleteById(id);
    }
}
