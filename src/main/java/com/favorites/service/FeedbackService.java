package com.favorites.service;

import com.favorites.domain.Feedback;

/**
 * Created by chenzhimin on 2017/2/23.
 */
public interface FeedbackService {

    void saveFeedback(Feedback feedback,Long userId);
}
