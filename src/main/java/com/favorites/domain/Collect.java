package com.favorites.domain;

import com.favorites.domain.enums.CollectType;
import com.favorites.domain.enums.IsDelete;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Collect  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private Long userId;
	@Column(nullable = false)
	private Long favoritesId;
	@Column(nullable = false)
	private String url;
	@Column(nullable = false)
	private String title;
	@Column(nullable = true, length = 65535, columnDefinition = "Text")
	private String description;
	@Column(nullable = true)
	private String logoUrl;
	@Column(nullable = true)
	private String charset;
	@Enumerated(EnumType.STRING) 
	@Column(nullable = true)
	private CollectType type;
	@Column(nullable = true)
	private String remark;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING) 
	private IsDelete isDelete;
	@Column(nullable = false)
	private Long createTime;
	@Column(nullable = false)
	private Long lastModifyTime;
	@Column(nullable = true)
	private String category;
	@Transient
	private String collectTime;
	@Transient
	private String newFavorites;

	public Collect() {
		super();
	}
}