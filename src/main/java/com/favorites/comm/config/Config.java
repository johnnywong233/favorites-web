package com.favorites.comm.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Config{
		
	@Value("${favorites.file.save.path}")
	private String savePath;
	@Value("${favorites.file.access.url}")
	private String accessUrl;
}