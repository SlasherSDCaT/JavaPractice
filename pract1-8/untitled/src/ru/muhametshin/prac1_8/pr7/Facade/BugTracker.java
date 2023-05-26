package ru.muhametshin.prac1_8.pr7.Facade;

public class BugTracker {
    boolean flag;

    boolean isFlag(){return flag;}

    void setFlag(boolean flag){
        this.flag = flag;
        if(flag){
            System.out.println("BugTracker is active");
        }else{
            System.out.println("BugTracker isn't active");
        }
    }
}
