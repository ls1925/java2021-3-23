package com.mini.stud;

public class Student {
    String id;
    String name;
    int math;
    int english;
    public Student(){
        super();
    }
    public Student(String id,String name,int english,int math){
        this.id = id;
        this.math =math;
        this.english = english;
        this.name = name;
    }
    public void print(){
        System.out.println(id + "\t" + name + "\t" + math + "\t" + english + "\t" + (math+english)/2 );
    }

}