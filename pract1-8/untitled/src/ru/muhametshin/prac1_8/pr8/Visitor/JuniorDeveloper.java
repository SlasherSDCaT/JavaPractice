package ru.muhametshin.prac1_8.pr8.Visitor;

public class JuniorDeveloper implements Visitor{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Junior is writing bad class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Junior is dropping database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Junior is writing bad tests...");
    }
}
