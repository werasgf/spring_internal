package com.senlainc.repository;

import com.senlainc.model.Review;

public interface ReviewRepository {
    public void save(Review review);
    public void update(Review review, int id);

    public Review findById(int id);

    public void delete(int id);
}
