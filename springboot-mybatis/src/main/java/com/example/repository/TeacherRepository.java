package com.example.repository;

import com.example.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by paul on 16/11/18.
 */
public interface TeacherRepository extends MongoRepository<Teacher,Long>{

    Teacher findByName(String name);
    Teacher findById(Long name);
}
