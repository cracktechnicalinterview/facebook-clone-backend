package com.example.facebookapi.Entity;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Status")
public class Status {

	@PrimaryKey
	private UUID statusID;
	
	private String userID;
	private String statusImageURL;
	private Timestamp uploadTIme;
	
	public Status() {
		super();
	}

	public Status(UUID statusID, String userID, String statusImageURL, Timestamp uploadTIme) {
		super();
		this.statusID = statusID;
		this.userID = userID;
		this.statusImageURL = statusImageURL;
		this.uploadTIme = uploadTIme;
	}

	public UUID getStatusID() {
		return statusID;
	}

	public void setStatusID(UUID statusID) {
		this.statusID = statusID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getStatusImageURL() {
		return statusImageURL;
	}

	public void setStatusImageURL(String statusImageURL) {
		this.statusImageURL = statusImageURL;
	}

	public Timestamp getUploadTIme() {
		return uploadTIme;
	}

	public void setUploadTIme(Timestamp uploadTIme) {
		this.uploadTIme = uploadTIme;
	}
	
	
}
