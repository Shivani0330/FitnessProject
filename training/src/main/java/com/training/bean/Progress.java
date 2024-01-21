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
@Table(name="progress")
public class Progress implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="progress_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long progressId;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="weight")
	private Double weight;
	
	@Column(name="fitness_test_results")
	private Double fitnessTestResults;

	public Long getProgressId() {
		return progressId;
	}

	public void setProgressId(Long progressId) {
		this.progressId = progressId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getFitnessTestResults() {
		return fitnessTestResults;
	}

	public void setFitnessTestResults(Double fitnessTestResults) {
		this.fitnessTestResults = fitnessTestResults;
	}

	@Override
	public String toString() {
		return "Progress [progressId=" + progressId + ", userId=" + userId + ", date=" + date + ", weight=" + weight
				+ ", fitnessTestResults=" + fitnessTestResults + "]";
	}
}
