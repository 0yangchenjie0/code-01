package com.bjpowernode.day13;

public class PrivateDemo02 {

}

class Student {

    private String studentNumber; // 学号
    private String name; // 姓名

    public Student() {

    }

    public Student(String studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
