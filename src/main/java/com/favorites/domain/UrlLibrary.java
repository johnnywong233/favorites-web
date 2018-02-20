package com.favorites.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by DingYS on 2016/12/29.
 */
@Entity
@Data
public class UrlLibrary extends Entitys implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String url;
    @Column(nullable = true)
    private String logoUrl;
    @Column(columnDefinition="INT default 0")
    private int count;
}
