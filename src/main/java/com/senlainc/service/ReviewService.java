package com.senlainc.service;

import com.senlainc.model.Review;

public interface ReviewService {
    void save(Review review);
    void update(Review review, int id);
    Review getReviewById(int id);
    void delete(int id);
}
