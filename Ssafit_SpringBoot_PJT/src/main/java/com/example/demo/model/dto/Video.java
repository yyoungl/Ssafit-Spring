package com.example.demo.model.dto;


import java.util.Date;

public class Video {
	private int videoId;
	private String title;
	private String fitPartName;
	private String channelName;
	private int viewCnt;
	private String url; 
	
	
	public Video() {
		
	}
	public Video(int videoId, String title, String fitPartName, String channelName, String url) {
		super();
		this.videoId = videoId;
		this.title = title;
		this.fitPartName = fitPartName;
		this.channelName = channelName;
		this.url = url;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFitPartName() {
		return fitPartName;
	}
	public void setFitPartName(String fitPartName) {
		this.fitPartName = fitPartName;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
