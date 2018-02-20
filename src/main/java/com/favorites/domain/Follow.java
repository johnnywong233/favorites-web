package com.favorites.domain;

import com.favorites.domain.enums.FollowStatus;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * 关注
 * 
 * @author DingYS
 * 
 */
@Data
@Entity
public class Follow extends Entitys implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private Long userId;
	@Column(nullable = false)
	private Long followId;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private FollowStatus status;
	@Column(nullable = false)
	private Long createTime;
	@Column(nullable = false)
	private Long lastModifyTime;
	@Transient
	private String name;

	public Follow() {
		super();
	}
}