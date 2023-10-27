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
    
    @Autowired
    public void setDao(ReviewDao reviewDao) {
        this.reviewDao = reviewDao;
    }

    public ReviewDao getDao() {
        return reviewDao;
    }
    


    public List<Review> selectAll() {
        return reviewDao.selectAll();
    }

    public List<Review> selectReview(int videoId) {
        return reviewDao.selectReview(videoId);
    }

    public Review selectOne(int reviewId) {
        return reviewDao.selectOne(reviewId);
    }

    public void insertReview(Review review) {
        reviewDao.insertReview(review);
    }

    public void updateReview(Review review) {
        reviewDao.updateReview(review);
    }

    public void deleteReview(int reviewId) {
        reviewDao.deleteReview(reviewId);
    }
}
