package io.amin.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ResourcePathAndBodyMismatchException extends RuntimeException {

    public ResourcePathAndBodyMismatchException() {
    }

    public ResourcePathAndBodyMismatchException(String message) {
        super(message);
    }

    public ResourcePathAndBodyMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

}
