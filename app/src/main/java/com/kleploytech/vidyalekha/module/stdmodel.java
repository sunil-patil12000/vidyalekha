package com.kleploytech.vidyalekha.module;

public class stdmodel {
    String reg,name,sem,phone;

    public stdmodel(String reg, String name, String sem, String phone) {
        this.reg = reg;
        this.name = name;
        this.sem = sem;
        this.phone = phone;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
