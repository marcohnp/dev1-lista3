package com.marcohnp.dev1lista3.expection.exceptions;

import java.util.Objects;

public class ContatoNotFoundException extends RuntimeException {

    private String message;

    public ContatoNotFoundException() {
        super();
    }

    public ContatoNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContatoNotFoundException)) return false;
        ContatoNotFoundException that = (ContatoNotFoundException) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
