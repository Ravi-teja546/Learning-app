package com.project.Anshul.Repo;

import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Anshul.Model.Course;

@Repository
public interface CourseDao extends CrudRepository<Course, Integer>{

	//List<Course> findById(String courseName);

}
