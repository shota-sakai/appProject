package com.example.app.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="AttendanceInfo")
public class AttendanceData {
	private String userId;
	private String date;

	public AttendanceData(){
	}

	public AttendanceData(String userId, String date){
		this.userId = userId;
		this.date = date;
	}

	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@DynamoDBAttribute
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
