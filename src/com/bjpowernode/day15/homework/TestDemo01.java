package com.bjpowernode.day15.homework;

public class TestDemo01 {
    public static void main(String[] args) {
        DataService service = new DataService();

        // 向上转型
        service.add(new Student()); // Student -- Object
        service.add(new Teacher()); // Teacher -- Object
        service.add(10);
        service.add("aa");
        service.add("");

//        Object student = new Student(); // 向上转型
//        service.add(student);
    }
}

class DataService {
    void add(Object obj) {
        if (obj instanceof Teacher) {
            System.out.println("老师");

        } else if (obj instanceof Student) {
            System.out.println("学生");
        } else {
            System.out.println("其它类型");
        }
    }
}

class Teacher extends Object {

}

class Student extends Object {

}
