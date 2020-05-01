package io.amin.blog.models.utils;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {

    @Column(name = "ADDRESS_STREET")
    private String Street;

    @Column(name = "ADDRESS_CITY")
    private String city;

    @Column(name = "ADDRESS_ZIP_CODE")
    private String zipCode;

    @Column(name = "ADDRESS_COUNTRY")
    private String country;

}