package ru.muhametshin.prac1_8.pr8.Visitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    Project(){
        projectElements = new ProjectElement[]{
                new Database(),
                new Test(),
                new ProjectClass()
        };
    }
    @Override
    public void beWritten(Visitor visitor) {
        for(ProjectElement projectElement : projectElements){
           projectElement.beWritten(visitor);
        }
    }
}
