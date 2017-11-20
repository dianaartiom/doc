package com.utm.reserver.services;

import com.utm.reserver.model.Doctor;
import com.utm.reserver.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public Doctor getByID(String id) {
        return doctorRepository.findById(id);
    }

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }
}
