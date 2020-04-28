package org.ajgroup.boot.repo;

import java.util.Optional;

import org.ajgroup.boot.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
