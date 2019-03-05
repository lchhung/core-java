package com.hung;

import com.google.gson.Gson;

public class HelloWorld {
    public static void main(String arg[]) {
        System.out.println("Hellow world");
        Student student = new Student();
        student.setName("Le Chi Hung");
        student.age = 10;
        Teacher teacher = new Teacher();
        teacher.setSalary("10000");

        student.goToClass();
        student.takeExam();


        Gson gson = new Gson();

        String studentString = "{\"salary\":\"10000\",\"age\":100}"; //gson.toJson(student);
        System.out.println("sudtentString:" + studentString );

        Student s2 = gson.fromJson(studentString, Student.class);

        System.out.println(s2.getName());


    }
}
