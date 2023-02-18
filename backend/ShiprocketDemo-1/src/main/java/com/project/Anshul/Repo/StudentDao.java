package com.project.Anshul.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Anshul.Model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, String> {

}
