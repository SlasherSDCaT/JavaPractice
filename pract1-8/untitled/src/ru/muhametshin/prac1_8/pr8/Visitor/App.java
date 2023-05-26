package ru.muhametshin.prac1_8.pr8.Visitor;

public class App {
    public static void main(String[] args) {
        Project project = new Project();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior programmer starts working...");
        project.beWritten(juniorDeveloper);
        System.out.println("\n=============================\n");
        System.out.println("Senior programmer starts working...");
        project.beWritten(seniorDeveloper);
    }
}
