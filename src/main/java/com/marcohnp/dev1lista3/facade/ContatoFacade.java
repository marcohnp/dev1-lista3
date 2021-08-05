package com.marcohnp.dev1lista3.facade;

import com.marcohnp.dev1lista3.mapper.ContatoMapper;
import com.marcohnp.dev1lista3.model.request.ContatoRequest;
import com.marcohnp.dev1lista3.model.response.ContatoResponse;
import com.marcohnp.dev1lista3.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContatoFacade {

    @Autowired
    private ContatoService service;

    public List<ContatoResponse> listar() {
        return service.listar().stream().map(ContatoMapper::mapModelToResponse).collect(Collectors.toList());
    }

    public ContatoResponse recuperar(Integer id) {
        return ContatoMapper.mapModelToResponse(service.recuperar(id));
    }

    public ContatoResponse inserir(ContatoRequest request) {
        return ContatoMapper.mapModelToResponse(service.inserir(ContatoMapper.mapRequestToModel(request)));
    }

    public ContatoResponse atualizar(Integer id, ContatoRequest request) {
        return ContatoMapper.mapModelToResponse(service.atualizar(id, ContatoMapper.mapRequestToModel(request)));
    }

    public void apagar(Integer id) {
        service.apagar(id);
    }
}
