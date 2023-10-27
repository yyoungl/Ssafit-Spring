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
	public List<Review> getReviewsByVideoId(@PathVariable String videoId) {
		return reviewService.selectReview(videoId);
	}
	
	// 리뷰 세부 화면을 위한 메서드
	@GetMapping("/review/{videoId}/{reviewId}")
	public Review getReviewById(@PathVariable String videoId, @PathVariable int reviewId) {
		return reviewService.selectOne(videoId, reviewId);
	}
	
	// 리뷰 등록
	@PostMapping("/review")
	public ResponseEntity<Void> addReview(@RequestBody Review review) {
		reviewService.insertReview(review);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	// 리뷰 수정
	@PutMapping("/review/{videoId}/{reviewId}")
	public ResponseEntity<Void> updateReview(@PathVariable String videoId, @PathVariable int reviewId, @RequestBody Review review) {
		reviewService.updateReview(videoId, reviewId, review.getTitle(), review.getContent());
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// 리뷰 삭제
	@DeleteMapping("/review/{videoId}/{reviewId}")
	public ResponseEntity<Void> deleteReview(@PathVariable String videoId, @PathVariable int reviewId) {
		reviewService.deleteReview(videoId, reviewId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
