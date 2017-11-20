package com.utm.reserver.repositories;

import com.utm.reserver.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
    public Doctor findByFirstName(String firstName);
    public Doctor findById(String id);
    public List<Doctor> findAll();
}
