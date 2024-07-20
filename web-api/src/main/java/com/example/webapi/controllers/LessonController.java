package com.example.webapi.controllers;

import com.example.webapi.entities.Lesson;
import com.example.webapi.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    @Autowired
    LessonService lessonService;


    @GetMapping
    public List<Lesson> getLessons(){
        return lessonService.getLessons();
    }

    @GetMapping("/{id}")
    public Lesson getLessonById(@PathVariable int id){return lessonService.getLessonById(id);}

    @PostMapping
    public void addLesson (@RequestBody Lesson lesson){lessonService.addLesson(lesson);}

    @DeleteMapping
    public void deleteLesson (@PathVariable int id){lessonService.deleteLesson(id);}

    @PutMapping("/{id}")
    public void updateLesson (@PathVariable int id, @RequestBody Lesson newLesson){
        lessonService.updateLesson(id, newLesson);
    }
}
