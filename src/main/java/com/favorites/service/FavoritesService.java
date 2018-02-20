package com.favorites.service;

import com.favorites.domain.Favorites;

public interface FavoritesService {
	
	Favorites saveFavorites(Long userId, Long count, String name);

}
