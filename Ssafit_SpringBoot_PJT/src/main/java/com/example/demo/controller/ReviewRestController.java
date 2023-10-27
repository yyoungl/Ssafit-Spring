package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.dto.Review;
import com.example.demo.model.service.ReviewServiceImpl;

@RestController
@RequestMapping("/api-review")
public class ReviewRestController {
	
	@Autowired
	private ReviewServiceImpl reviewService;
	
	
	// 비디오 목록에 리뷰 리스트 보여주기 위해서
	@GetMapping("/reviews/{videoId}")
	public List<Review> getReviewsByVideoId(@PathVariable int videoId) {
		return reviewService.selectReview(videoId);
	}
	
	// 리뷰 세부 화면을 위한 메서드
	@GetMapping("/review/{reviewId}")
	public Review getReviewById(int reviewId) {
		return reviewService.selectOne(reviewId);
	}
	
	// 리뷰 등록
	@PostMapping("/review")
	public ResponseEntity<Void> addReview(@RequestBody Review review) {
		reviewService.insertReview(review);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	// 리뷰 수정
	@PutMapping("/review")
	public ResponseEntity<Void> updateReview(@RequestBody Review review) {
		reviewService.updateReview(review);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// 리뷰 삭제
	@DeleteMapping("/review/{reviewId}")
	public ResponseEntity<Void> deleteReview(@PathVariable int reviewId) {
		reviewService.deleteReview(reviewId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
