package ru.muhametshin.prac1_8.pr7.Adapter;


public class app {
    public static void main(String[] args) {
        JavaApplication database = new JavaApplication();
        database.createApplication();
        database.updateApplication();
        database.saveApplication();
        database.deleteApplication();
    }
}
