package com.example.webapi.services;

import com.example.webapi.entities.Pupil;
import com.example.webapi.repositories.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PupilService {


    @Autowired
    PupilRepository pupilRepository;

    public List<Pupil> getPupils() {
        return (List<Pupil>) pupilRepository.findAll();
    }

    public Pupil getPupilById(int id) {
        return pupilRepository.findById(id).orElse(null);
    }

    public void addPupil(Pupil pupil) {
        pupilRepository.save(pupil);
    }

    public void deletePupil(int id) {
        pupilRepository.deleteById(id);
    }

    public void updatePupil(int id, Pupil newPupil) {
        pupilRepository.deleteById(id);
        pupilRepository.save(newPupil);

    }
}
