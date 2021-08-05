package com.marcohnp.dev1lista3.expection.exceptions;

public class RequestInvalidaException extends RuntimeException {

    public RequestInvalidaException() {
        super("Request inválida. Nome e Telefone do contato não podem serem nulos ou vazios");
    }
}
