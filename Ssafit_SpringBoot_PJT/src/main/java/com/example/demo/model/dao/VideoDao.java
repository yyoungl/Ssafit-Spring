package com.example.demo.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.dto.Video;


public interface VideoDao {

    // 모든 비디오를 조회
    List<Video> select();

    // 특정 ID를 가진 비디오를 조회
    Video selectVideoById(int videoId);

    // 조회수 순서대로 비디오를 조회
    List<Video> selectByView();

    // 특정 운동 부위별로 비디오를 조회
    List<Video> selectByPart(String part);
}
