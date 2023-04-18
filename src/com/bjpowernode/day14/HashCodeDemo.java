package com.bjpowernode.day14;

import java.util.Objects;

public class HashCodeDemo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode()); //460141958
        System.out.println(obj2.hashCode()); //1163157884

        Stundet s1 = new Stundet("001",18);
        Stundet s2 = new Stundet("001",18);

        System.out.println(s1.equals(s2));// true

        System.out.println(s1.hashCode()); //1478594
        System.out.println(s2.hashCode()); //1478594


    }
}


class Stundet {
    private String number;
    private int age;

    public Stundet(String number, int age) {
        this.number = number;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stundet{" +
                "number='" + number + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stundet stundet = (Stundet) o;
        return age == stundet.age && Objects.equals(number, stundet.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, age);
    }
}