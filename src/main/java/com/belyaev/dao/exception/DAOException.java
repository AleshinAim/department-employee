package com.belyaev.dao.exception;

/**
 * TODO: comment
 *
 * @author Pavel Belyaev
 * @since 27-Nov-17
 */
public class DAOException extends Exception {

    private static final long serialVersionUID = 19192L;
    private String message;

    public DAOException() {
    }

    public DAOException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}

