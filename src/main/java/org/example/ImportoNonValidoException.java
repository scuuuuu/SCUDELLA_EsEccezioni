package org.example;

public class ImportoNonValidoException extends RuntimeException {
    public ImportoNonValidoException(String messaggio) {
        super(messaggio);
    }
}