package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import com.neoteric.javatdd.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentFormTest {
    @Test
    public void studentAgeGreaterThanSix(){

        Address address = new Address();
        address.area="Miyapur";

        Student arun = new Student();
        arun.age=4;
        arun.address=address;
        arun.firstname="Arun";
        arun.standard="I";

        Student student1 = new Student();
        student1.age=6;
        student1.address=address;
        student1.firstname="Arun";
        student1.standard="I";


        StudentService service = new StudentService();
        Admission add = service.getAdmission(arun);
      System.out.println(add);

//        Assertions.assertEquals(10000,add.fee);
//        Assertions.assertNotNull(add.rollNumber);
   }

}
