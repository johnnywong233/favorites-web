package com.favorites.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 用户反馈javaBean类
 * Created by chenzhimin on 2017/2/23.
 */
@Entity
@Data
public class Feedback  extends Entitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private Long userId;
    @Column(nullable = false)
    private String feedbackAdvice;
    @Column
    private String feedbackName;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private Long createTime;
    @Column(nullable = false)
    private Long lastModifyTime;
}
