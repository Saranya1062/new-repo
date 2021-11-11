package com.sf.oops;

public class Student{

    String name;
    int rollNo;
    int age;

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Age: "+age);
    }


    public static void main(String[] args) {
        Student student = new Student();
        student.name = "sri";
        student.rollNo = 253;
        student.age = 25;

        student.info();
    }
}

