package com.project.Anshul.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Anshul.Model.Course;
import com.project.Anshul.Repo.CourseDao;

@Service
public class AdminService {

	@Autowired
	private CourseDao courseDao;
	
	public Course addCourse(Course course) {
		
		return courseDao.save(course);
	}

	public Course update(Course course) {
		// TODO Auto-generated method stub
		return courseDao.save(course);
	}

	public void delete(int courseId) {
		courseDao.deleteById(courseId);
	}


}
