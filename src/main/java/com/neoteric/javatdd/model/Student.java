package com.neoteric.javatdd.model;

public class Student {
    public String firstname;

   public  int age;

   public String address;

   public String standard;

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", standard='" + standard + '\'' +
                '}';
    }
}
