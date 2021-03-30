package com.mini.stud;

public class Graduate
        extends Student
        implements  Mailer{

    int thesis;
    public Graduate(String id,String name,int english,int math,int thesis){
        super(id,name,english,math);
        this.thesis = thesis;
    }
    public void mail(){

    }
}
