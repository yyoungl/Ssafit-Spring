package com.example.demo.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.VideoDao;
import com.example.demo.model.dto.Video;

@Service
public class VideoServiceImpl {

    @Autowired
    private VideoDao videoDao;

    @Autowired
    public void setDao(VideoDao videoDao) {
    	this.videoDao = videoDao;
    }
    
    public VideoDao getDao() {
    	return videoDao;
    }
    
    // 모든 비디오를 조회
    public List<Video> selectAllVideos() {
        return videoDao.select();
    }

    // 특정 ID를 가진 비디오를 조회
    public Video selectVideoById(int videoId) {
        return videoDao.selectVideoById(videoId);
    }

    // 조회수 순서대로 비디오를 조회
    public List<Video> selectByView() {
        return videoDao.selectByView();
    }

    // 특정 운동 부위별로 비디오를 조회
    public List<Video> selectByPart(String part) {
        return videoDao.selectByPart(part);
    }
}
