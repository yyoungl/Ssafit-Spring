package com.example.demo.model.dao;


import java.util.ArrayList;

import com.example.demo.model.dto.Review;


// DB 흉내
public interface ReviewDao {

	// 게시글 전체 조회
	ArrayList<Review> selectReview(String videoId);

	// 게시글 등록
	void insertReview(Review review);

	// 게시글 상세 조회
	Review selectOne(String videoId, int reviewId);

	// 게시글 수정
	void updateReview(String videoId, int reviewId, String newTitle, String newContent);

	// 게시글 삭제
	void deleteReview(String videoId, int reviewId);
	
	ArrayList<Review> selectAll();

}
