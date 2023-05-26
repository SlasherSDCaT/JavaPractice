package ru.muhametshin.prac1_8.pr8.Mediator;



public class App {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Fan fan = new Fan(mediator);
        fan.turnOn();
        fan.turnOff();
    }
}
