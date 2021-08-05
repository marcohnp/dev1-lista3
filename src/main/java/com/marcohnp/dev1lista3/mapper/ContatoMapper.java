package com.marcohnp.dev1lista3.mapper;

import com.marcohnp.dev1lista3.entity.ContatoEntity;
import com.marcohnp.dev1lista3.model.ContatoModel;
import com.marcohnp.dev1lista3.model.request.ContatoRequest;
import com.marcohnp.dev1lista3.model.response.ContatoResponse;

public class ContatoMapper {

    public static ContatoModel mapRequestToModel(ContatoRequest request) {
        return new ContatoModel(request.getId(), request.getNomeCompleto(), request.getTelefone());
    }

    public static ContatoEntity mapModelToEntity(ContatoModel model) {
        return new ContatoEntity(model.getId(), model.getNomeCompleto(), model.getTelefone());
    }

    public static ContatoResponse mapModelToResponse(ContatoModel model) {
        return new ContatoResponse(model.getId(), model.getNomeCompleto(), model.getTelefone());
    }

    public static ContatoModel mapEntityToModel(ContatoEntity entity) {
        return new ContatoModel(entity.getId(), entity.getNomeCompleto(), entity.getTelefone());
    }
}
