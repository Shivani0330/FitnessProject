package com.training.service;

import java.util.List;

import com.training.bean.Progress;

public interface ProgressService {

	void save(Progress progress);

	void update(Progress progress);

	List<Progress> getAll();

	Progress delete(Long id);

}
