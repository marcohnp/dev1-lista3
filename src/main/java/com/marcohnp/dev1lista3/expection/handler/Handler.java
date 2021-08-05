package com.marcohnp.dev1lista3.expection.handler;

import com.marcohnp.dev1lista3.expection.error.StandardError;
import com.marcohnp.dev1lista3.expection.exceptions.ContatoNotFoundException;
import com.marcohnp.dev1lista3.expection.exceptions.RequestInvalidaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class Handler {

    @ExceptionHandler(ContatoNotFoundException.class)
    public ResponseEntity<StandardError> livroNotFound(ContatoNotFoundException e, HttpServletRequest request) {
        return new ResponseEntity<>(new StandardError(Instant.now(), HttpStatus.NOT_FOUND.value(),
                "Request não completada.", e.getMessage(), request.getRequestURI()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RequestInvalidaException.class)
    public ResponseEntity<StandardError> requestInvalida(RequestInvalidaException e, HttpServletRequest request) {
        return new ResponseEntity<>(new StandardError(Instant.now(), HttpStatus.BAD_REQUEST.value(),
                "Request não completada.", e.getMessage(), request.getRequestURI()), HttpStatus.BAD_REQUEST);
    }
}
