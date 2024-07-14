package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;

import java.util.UUID;


public class StudentService {
    public Admission getAdmission(Student student){
        Admission admission = null;
        if (student.age>= 6){
            admission = new Admission();
            admission.rollNumber= "TG" + UUID.randomUUID().toString();
            admission.fee=30000;
            admission.standard=student.standard;

        }

        return admission;
    }
}
