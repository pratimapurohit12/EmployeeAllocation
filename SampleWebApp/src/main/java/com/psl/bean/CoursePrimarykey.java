package com.psl.bean;

import java.io.Serializable;

public class CoursePrimarykey implements Serializable{
	
	
	private int trainingId;
	private int courseId;
	
	public CoursePrimarykey() {
		// TODO Auto-generated constructor stub
	}

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
	
	
}
