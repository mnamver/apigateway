package com.betbull.Exception;

public class ApiGatewayException extends Exception {

    private String message;
    private int errorCode;

    public ApiGatewayException(String message) {
        super();
        this.message = message;
    }

    public ApiGatewayException(String message , int errorCode){
        super();
        this.message = message;
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
