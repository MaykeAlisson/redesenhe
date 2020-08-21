package br.com.redesenhe.infra.exception;

public class BusinessException extends Exception {

    public BusinessException( final String message ) {

        super(message);
    }

    public BusinessException( final Throwable cause ) {

        super( cause );
    }
}
