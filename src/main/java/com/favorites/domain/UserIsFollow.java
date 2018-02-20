package com.favorites.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 随便看看右侧关注使用
 * Created by chenzhimin on 2017/1/19.
 */
@Entity
@Data
public class UserIsFollow implements Serializable{
    @Id
    private Long id;
    private String userName;
    private String profilePicture;
    private String isFollow;
}
