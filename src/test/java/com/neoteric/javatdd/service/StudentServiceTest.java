package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void studentAgeGreaterThanSix() {
        Address address = new Address();
        address.area="Miyapur";

        Student student = new Student();
        student.age=6;
        student.address=address;
        student.firstname="Arun";
        student.standard="I";

        Student student1 = new Student();
        student1.age=6;
        student1.address=address;
        student1.firstname="Arun";
        student1.standard="I";


        StudentService service = new StudentService();
        Admission add = service.getAdmission(student1);
//        System.out.println(add);

        Assertions.assertEquals(30000,add.fee);
        Assertions.assertNotNull(add.rollNumber);
    }
}