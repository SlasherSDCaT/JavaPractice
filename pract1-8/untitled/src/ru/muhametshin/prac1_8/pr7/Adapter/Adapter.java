package ru.muhametshin.prac1_8.pr7.Adapter;


public class Adapter extends JavaApplication implements Database{

    @Override
    public void insert() {
        createApplication();
    }

    @Override
    public void delete() {
        deleteApplication();
    }

    @Override
    public void update() {
        updateApplication();
    }

    @Override
    public void save() {
        saveApplication();
    }
}
