package com.example.webapi.repositories;

import com.example.webapi.entities.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends CrudRepository <Lesson, Integer>{
}
