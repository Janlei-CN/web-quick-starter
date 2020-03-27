package com.janlei.filter;

public class JLException extends Exception{


    private int code;

    public JLException(int code) {
        this.code = code;
    }

    public JLException(String message, int code) {
        super(message);
        this.code = code;
    }

    public JLException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public JLException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public JLException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
