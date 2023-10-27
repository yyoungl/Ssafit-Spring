package com.example.demo.model.service;

import java.util.List;
import com.example.demo.model.dto.Review;

public interface ReviewService {

    List<Review> selectAll();

    List<Review> selectReview(String videoId);

    Review selectOne(String videoId, int reviewId);

    void insertReview(Review review);

    void updateReview(String videoId, int reviewId, String newTitle, String newContent);

    void deleteReview(String videoId, int reviewId);
}
