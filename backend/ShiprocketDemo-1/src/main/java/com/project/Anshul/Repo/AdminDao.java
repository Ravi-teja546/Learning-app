package com.project.Anshul.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.Anshul.Model.Admin;

@Repository
public interface AdminDao extends CrudRepository<Admin, Integer> {

}
