package ru.muhametshin.prac1_8.pr7.Facade;

public class JavaDeveloper {
    void doStuff(boolean bugTracker){
        if(bugTracker) {
            System.out.println("Developer is solving problems...");
        }else{
            System.out.println("Developer is chilling");
        }
    }
}
