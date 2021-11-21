package com.company;

public class BakiyeYetersizException extends Exception {

    String message;

    public BakiyeYetersizException(String gelenmesaj)
    {
        this.message = gelenmesaj;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
