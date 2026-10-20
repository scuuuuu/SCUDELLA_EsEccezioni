package org.example;

public class FalcariNotFound extends Exception {
    private int statusCode;
    public FalcariNotFound(String message) {
        super(message);
    }
    public  FalcariNotFound(String message, int statusCode){
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
