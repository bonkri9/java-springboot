package com.ssafit.model.dto;

public class Video {

	private String videoId;
	private String title;
	private String part;
	private String channelName;
	private String url;
	private int videoViewCnt;

	public Video() {
		// TODO Auto-generated constructor stub
		this.title = " ";
		this.url = " ";
		this.part = " ";
	}

	public Video(String videoId, String title, String part, String channelName, String url, int videoViewCnt) {
		super();
		this.videoId = videoId;
		this.title = title;
		this.part = part;
		this.channelName = channelName;
		this.url = url;
		this.videoViewCnt = videoViewCnt;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getVideoViewCnt() {
		return videoViewCnt;
	}

	public void setVideoViewCnt(int videoViewCnt) {
		this.videoViewCnt = videoViewCnt;
	}

	@Override
	public String toString() {
		return "Video [videoId=" + videoId + ", title=" + title + ", part=" + part + ", channelName=" + channelName
				+ ", url=" + url + ", videoViewCnt=" + videoViewCnt + "]";
	}

}
