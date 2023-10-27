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

    public List<Video> selectAllVideos() {
        return videoDao.selectAllVideos();
    }

    public Video selectVideoById(int videoId) {
        return videoDao.selectVideoById(videoId);
    }

}
