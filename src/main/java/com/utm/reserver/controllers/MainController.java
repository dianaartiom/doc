package com.utm.reserver.controllers;

import com.utm.reserver.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class MainController {

    @Autowired
    DoctorService doctorService;

    @GetMapping(path = "/doctors", produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<?> getAll() {
        return new ResponseEntity(doctorService.findAll(), OK);
    }

    /** Probabil problema vine de la path variable
     * TODO de implementat pathvariable */
//    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public HttpEntity<?> getBookById(@PathVariable  String id) {
//        return new ResponseEntity(doctorService.getByID(id), OK);
//    }

    @GetMapping(path = "/")
    public HttpEntity<?> get() {
        return new ResponseEntity<Object>(doctorService.getByID("5a12c9c59517f705b0fa9c6f"), OK);
    }
}
