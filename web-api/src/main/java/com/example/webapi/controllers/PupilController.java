package com.example.webapi.controllers;

import com.example.webapi.entities.Mock;
import com.example.webapi.entities.Pupil;
import com.example.webapi.services.PupilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pupil")
public class PupilController {


    //CRUD: create read update delete

    //הזרקת תלויות
    //bean של spring - מחלקה מיוחדת של spring (Controller, Service....)
    @Autowired
    PupilService pupilService;

    @GetMapping
    public List<Pupil> getPupils() {
        return pupilService.getPupils();
    }

    @GetMapping("/{id}")
    public Pupil getPupilById(@PathVariable int id) {
        return pupilService.getPupilById(id);
    }

    /*
     * "{"id":1,"name":"Ester"}"
     * Pupil p = new Pupil();
     * p.setId(1);
     * */
    @PostMapping
    public void addPupil(@RequestBody Pupil pupil) {
        pupilService.addPupil(pupil);
    }

    @DeleteMapping("/{id}")
    public void deletePupil(@PathVariable int id) {
        pupilService.deletePupil(id);
    }

    @PutMapping("/{id}")
    public void updatePupil(@PathVariable int id, @RequestBody Pupil newPupil) {
        pupilService.updatePupil(id, newPupil);
    }
}
