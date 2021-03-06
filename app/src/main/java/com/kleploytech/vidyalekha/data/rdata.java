package com.kleploytech.vidyalekha.data;

import android.content.Intent;

public class rdata {
    String name,sem,regNo,depa,email,phone;

    public rdata() {
    }

    public rdata(String name, String sem, String regNo, String depa, String email, String phone) {
        this.name = name;
        this.sem = sem;
        this.regNo = regNo;
        this.depa = depa;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getDepa() {
        return depa;
    }

    public void setDepa(String depa) {
        this.depa = depa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
