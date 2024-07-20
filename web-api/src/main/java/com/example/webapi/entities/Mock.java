package com.example.webapi.entities;

import java.util.ArrayList;
import java.util.List;

public class Mock {
    public static List<Pupil> pupils = new ArrayList<>();
    static {
        pupils.add(new Pupil(1, "Sara"));
        pupils.add(new Pupil(2, "Rivka"));
        pupils.add(new Pupil(3, "Rachel"));
        pupils.add(new Pupil(4, "Leah"));
    }

    public static List<Lesson> lessons = new ArrayList<>();
    static {
        lessons.add(new Lesson(1, "Math"));
        lessons.add(new Lesson(2, "English"));
        lessons.add(new Lesson(3, "History"));
    }
}
