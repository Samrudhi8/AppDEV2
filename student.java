package com.example.sqllite;

public class student {

    String regNo;
    String name;
    String branch;
    int marks;

    public student() {
    }

    public student(String regNo, String name, String branch, int marks) {
        this.regNo = regNo;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
