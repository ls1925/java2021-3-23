package com.mini.stud;

public class Graduate extends Student{
    int thesis;
    public Graduate(String id,String name,int english,int math,int thesis){
        super(id,name,english,math);
        this.thesis = thesis;
    }
}
