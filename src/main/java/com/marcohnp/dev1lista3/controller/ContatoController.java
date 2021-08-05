package com.marcohnp.dev1lista3.controller;

import com.marcohnp.dev1lista3.expection.exceptions.RequestInvalidaException;
import com.marcohnp.dev1lista3.facade.ContatoFacade;
import com.marcohnp.dev1lista3.model.request.ContatoRequest;
import com.marcohnp.dev1lista3.model.response.ContatoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/contatos")
public class ContatoController {

    @Autowired
    private ContatoFacade facade;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ContatoResponse> listar() {
        return facade.listar();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ContatoResponse recuperar(@PathVariable Integer id) {
        return facade.recuperar(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoResponse inserir(@Valid @RequestBody ContatoRequest request, BindingResult errors) {
        if (errors.hasErrors()) {
            throw new RequestInvalidaException();
        }
        return facade.inserir(request);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ContatoResponse atualizar(@PathVariable Integer id, @Valid @RequestBody ContatoRequest request, BindingResult errors) {
        if (errors.hasErrors()) {
            throw new RequestInvalidaException();
        }
        return facade.atualizar(id, request);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apagar(@PathVariable Integer id) {
        facade.apagar(id);
    }

}
