package ru.muhametshin.prac1_8.pr7.Facade;


public class Facade {
    BugTracker bugTracker = new BugTracker();
    JavaDeveloper javaDeveloper = new JavaDeveloper();
    Manager manager = new Manager();
    void setActive(){
        System.out.println("Team is working");
        bugTracker.setFlag(true);
        javaDeveloper.doStuff(bugTracker.isFlag());
        manager.doStuff(bugTracker.isFlag());
    }

    void setInactive(){
        System.out.println("Team is chilling");
        bugTracker.setFlag(false);
        javaDeveloper.doStuff(bugTracker.isFlag());
        manager.doStuff(bugTracker.isFlag());
    }
}
