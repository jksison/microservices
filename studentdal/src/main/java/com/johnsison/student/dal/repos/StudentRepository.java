package com.johnsison.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.johnsison.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
