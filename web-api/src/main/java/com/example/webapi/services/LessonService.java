package com.example.webapi.services;

import com.example.webapi.entities.Lesson;
import com.example.webapi.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    @Autowired
    LessonRepository lessonRepository;

    public List<Lesson> getLessons(){return (List<Lesson>) lessonRepository.findAll();}
    public Lesson getLessonById(int id){return lessonRepository.findById(id).orElse(null);}
    public void addLesson (Lesson lesson) {lessonRepository.save(lesson);}
    public void deleteLesson (int id) {lessonRepository.deleteById(id);}
    public void updateLesson (int id, Lesson newLesson){
        lessonRepository.deleteById(id);
        lessonRepository.save(newLesson);
    }
}
