package com.senlainc.service.impl;

import com.senlainc.model.Review;
import com.senlainc.repository.ReviewRepository;
import com.senlainc.repository.impl.ReviewRepositoryImpl;
import com.senlainc.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository = new ReviewRepositoryImpl();

    @Override
    public void save(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public void update(Review review, int id) {
        reviewRepository.update(review, id);
    }

    @Override
    public Review getReviewById(int id) {
        return reviewRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        reviewRepository.delete(id);
    }
}
