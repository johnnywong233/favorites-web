package com.favorites.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * 收藏夹
 * @author DingYS
 *
 */
@Data
@Entity
public class Favorites extends Entitys implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private Long userId;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Long count;
	@Column(nullable = false)
	private Long createTime;
	@Column(nullable = false)
	private Long lastModifyTime;
	@Transient
	private Long publicCount;
}