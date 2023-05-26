package ru.muhametshin.prac1_8.pr8.Visitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void beWritten(Visitor visitor) {
        visitor.create(this);
    }
}
