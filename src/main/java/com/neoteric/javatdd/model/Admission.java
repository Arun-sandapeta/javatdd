package com.neoteric.javatdd.model;

public class Admission {
    public String rollNumber;

    public String standard;

    public double fee;

    @Override
    public String toString() {
        return "Admission{" +
                "rollNumber='" + rollNumber + '\'' +
                ", standard='" + standard + '\'' +
                ", fee=" + fee +
                '}';
    }
}
