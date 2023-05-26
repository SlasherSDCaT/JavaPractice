package ru.muhametshin.prac1_8.pr8.Visitor;

public class SeniorDeveloper implements Visitor{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Senior is writing good class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Senior is fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Senior is writing good tests...");
    }
}
