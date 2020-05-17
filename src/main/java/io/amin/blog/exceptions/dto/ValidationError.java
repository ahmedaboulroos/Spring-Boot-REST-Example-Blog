package io.amin.blog.exceptions.dto;

import lombok.Data;

@Data
public class ValidationError {

    private String code;
    private String message;

}
