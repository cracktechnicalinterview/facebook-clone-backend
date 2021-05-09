package com.example.facebookapi.Entity;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("facebookpost")
public class Post {

	@PrimaryKey
	private UUID postID;
	
	private String userID;
	private String userName;
	private String imageURL;
	
	private String description;
	private String postImgURL;
	
	private int likes;
	private Timestamp dateTime;
	
	
	public Post() {

	}


	public Post(UUID postID, String userID, String userName, String imageURL, String description, String postImgURL,
			int likes, Timestamp dateTime) {
		super();
		this.postID = postID;
		this.userID = userID;
		this.userName = userName;
		this.imageURL = imageURL;
		this.description = description;
		this.postImgURL = postImgURL;
		this.likes = likes;
		this.dateTime = dateTime;
	}


	public UUID getPostID() {
		return postID;
	}


	public void setPostID(UUID postID) {
		this.postID = postID;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPostImgURL() {
		return postImgURL;
	}


	public void setPostImgURL(String postImgURL) {
		this.postImgURL = postImgURL;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}


	public Timestamp getDateTime() {
		return dateTime;
	}


	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
	
	
}
