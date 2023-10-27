package com.example.demo.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.ReviewDao;
import com.example.demo.model.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewDao reviewDao;

    public List<Review> selectAll() {
        return reviewDao.selectAll();
    }

    public List<Review> selectReview(String videoId) {
        return reviewDao.selectReview(videoId);
    }

    public Review selectOne(String videoId, int reviewId) {
        return reviewDao.selectOne(videoId, reviewId);
    }

    public void insertReview(Review review) {
        reviewDao.insertReview(review);
    }

    public void updateReview(String videoId, int reviewId, String newTitle, String newContent) {
        reviewDao.updateReview(videoId, reviewId, newTitle, newContent);
    }

    public void deleteReview(String videoId, int reviewId) {
        reviewDao.deleteReview(videoId, reviewId);
    }
}
