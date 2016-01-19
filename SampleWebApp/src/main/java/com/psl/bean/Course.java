package com.psl.bean;
import java.util.*;
public class Course {

	CoursePrimarykey primaryKey=new CoursePrimarykey();
	
	private String courseName;	
	private  Date startDate;
	private Date endDate;
	private String status;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public CoursePrimarykey getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(CoursePrimarykey primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
