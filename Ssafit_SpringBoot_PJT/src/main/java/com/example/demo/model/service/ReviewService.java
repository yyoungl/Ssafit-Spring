package com.example.demo.model.service;

import java.util.List;
import com.example.demo.model.dto.Review;

public interface ReviewService {

    List<Review> selectAll();

    List<Review> selectReview(int videoId);

    Review selectOne(int reviewId);

    void insertReview(Review review);

    void updateReview(Review review);

    void deleteReview(int reviewId);
}
