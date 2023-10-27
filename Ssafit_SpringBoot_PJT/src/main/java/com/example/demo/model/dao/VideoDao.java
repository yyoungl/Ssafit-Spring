package com.example.demo.model.dao;

import java.util.List;
import com.example.demo.model.dto.Video;

public interface VideoDao {

    List<Video> selectAllVideos();

    Video selectVideoById(int videoId);

    // ... other methods for video operations ...
}
