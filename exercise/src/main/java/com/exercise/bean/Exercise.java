package com.exercise.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exercise")
public class Exercise implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="exercise_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long exerciseId;
	
	@Column(name="exercise_name")
	private String exerciseName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="exercise_type")
	private String exerciseType;
	
	@Column(name="number_of_sets")
	private Integer numberOfSets;
	
	@Column(name="equipment_needed")
	private String equipmentNeeded;
	
	public Long getExerciseId() {
		return exerciseId;
	}

	public void setExerciseId(Long exerciseId) {
		this.exerciseId = exerciseId;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExerciseType() {
		return exerciseType;
	}

	public void setExerciseType(String exerciseType) {
		this.exerciseType = exerciseType;
	}

	public Integer getNumberOfSets() {
		return numberOfSets;
	}

	public void setNumberOfSets(Integer numberOfSets) {
		this.numberOfSets = numberOfSets;
	}

	public String getEquipmentNeeded() {
		return equipmentNeeded;
	}

	public void setEquipmentNeeded(String equipmentNeeded) {
		this.equipmentNeeded = equipmentNeeded;
	}

	public String getIntensityLevel() {
		return intensityLevel;
	}

	public void setIntensityLevel(String intensityLevel) {
		this.intensityLevel = intensityLevel;
	}

	@Column(name="intensity_level")
	private String intensityLevel;

	
}
