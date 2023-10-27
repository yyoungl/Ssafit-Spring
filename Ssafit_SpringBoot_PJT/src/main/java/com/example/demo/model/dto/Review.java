package com.example.demo.model.dto;

import java.util.Date;

public class Review {
	private int videoId;
	private int reviewId;
	private String title;
	private String writer;
	private String regDate; // new Date().toString();
	private String content;
	private int viewCnt;
	
	public Review() {
		
	}

	public Review(int videoId, int reviewId, String title, String writer, String content, int viewCnt) {
		super();
		this.videoId = videoId;
		this.reviewId = reviewId;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date().toString();
		this.viewCnt = 0;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	@Override
	public String toString() {
		return "Review [videoId=" + videoId + ", reviewId=" + reviewId + ", title=" + title + ", writer=" + writer
				+ ", regDate=" + regDate + ", content=" + content + ", viewCnt=" + viewCnt + "]";
	}
	
	
}
