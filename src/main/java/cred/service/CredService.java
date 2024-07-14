package cred.service;

import cred.model.Customer;
import cred.model.Otp;


import java.util.Date;



public class CredService {
    public Otp registration(Customer customer){
        Otp otp = new Otp();
        int randomNumber =(int) (Math.random()*9000)+1000;
        String number = String.valueOf(randomNumber);
        otp.otpNumber= number;
        otp.creationTime=new Date();

        long currentTime = otp.creationTime.getTime();
        long endTime = currentTime+3000;
        otp.expireTime=new Date(endTime);


        return otp;
    }



}
