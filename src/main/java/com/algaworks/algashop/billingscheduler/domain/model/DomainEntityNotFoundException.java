package com.algaworks.algashop.billingscheduler.domain.model;

public class DomainEntityNotFoundException extends RuntimeException {

    public DomainEntityNotFoundException(Throwable cause) {
        super(cause);
    }

    public DomainEntityNotFoundException() {
        super();
    }

    public DomainEntityNotFoundException(String message) {
        super(message);
    }

    public DomainEntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
