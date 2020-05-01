package io.amin.blog.models.utils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "IMAGES")
public class Image {
    
    @Id
    @GeneratedValue
    @Column(name = "IMAGE_ID")
    private int id;

    @Column(name = "IMAGE_PATH")
    private String path;

    @Column(name = "IMAGE_NAME")
    private String name;

    @Column(name = "IMAGE_FORMAT")
    private String format;

}