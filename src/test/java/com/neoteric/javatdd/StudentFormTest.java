package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import com.neoteric.javatdd.service.StudentService;
import org.junit.jupiter.api.Test;

public class StudentFormTest {
    @Test
    public void test(){

        Student student = new Student();
        student.age=6;
        student.address="miyapur";
        student.firstname="Arun";
        student.standard="I";

        Student student1 = new Student();
        student1.age=5;
        student1.address="miyapur";
        student1.firstname="Arun";
        student1.standard="I";

        StudentService service = new StudentService();
         Admission add = service.getAdmission(student1);
        System.out.println(add);
    }
}
