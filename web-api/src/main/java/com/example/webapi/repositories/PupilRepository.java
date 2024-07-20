package com.example.webapi.repositories;

import com.example.webapi.entities.Pupil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PupilRepository extends CrudRepository<Pupil, Integer> {
}
