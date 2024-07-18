package cred.model;

import java.util.Date;

public class Otp {
    public String otpNumber;
    public Customer customerId;
    public Date creationTime;
    public Date expireTime;

    @Override
    public String toString() {
        return "Otp{" +
                "otpNumber='" + otpNumber + '\'' +
                ", customerId=" + customerId +
                ", creationTime=" + creationTime +
                ", expireTime=" + expireTime +
                '}';
    }
}
