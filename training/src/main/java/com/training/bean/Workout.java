package com.training.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="workout")
public class Workout implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="workout_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long workoutId;
	
	@Column(name="workout_date")
	private Date workoutDate;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="calories_burned")
	private String caloriesBurned;
	
	@Column(name="note")
	private String note;
	
	@Column(name="user_id")
	private Long userId;

	public Long getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(Long workoutId) {
		this.workoutId = workoutId;
	}

	public Date getWorkoutDate() {
		return workoutDate;
	}

	public void setWorkoutDate(Date workoutDate) {
		this.workoutDate = workoutDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCaloriesBurned() {
		return caloriesBurned;
	}

	public void setCaloriesBurned(String caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Workout [workoutId=" + workoutId + ", workoutDate=" + workoutDate + ", duration=" + duration
				+ ", caloriesBurned=" + caloriesBurned + ", note=" + note + ", userId=" + userId + "]";
	}
}
