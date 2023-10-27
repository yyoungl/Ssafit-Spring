package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.dto.Video;
import com.example.demo.model.service.VideoServiceImpl;

@RestController
@RequestMapping("/api-video")
public class VideoRestController {
	
	@Autowired
	private VideoServiceImpl videoService;
	
	// 전체 비디오 리스트 받아오기
	@GetMapping("/videos")
	public List<Video> getAllVideos() {
		return videoService.selectAllVideos();
	}
	
	// 특정한 비디오 아이디를 주고 해당 비디오의 세부 정보를 받아오기
	@GetMapping("/video/{videoId}")
	public Video getVideoById(@PathVariable int videoId) {
		return videoService.selectVideoById(videoId);
	}
	
	// ... other CRUD operations for videos if needed ...
}
