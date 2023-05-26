package ru.muhametshin.prac1_8.pr8.Mediator;


public class Fan {
    private Mediator mediator;
    public boolean isOn = false;

    Fan(Mediator mediator){
        this.mediator = mediator;
    }

    public void turnOn() {
        mediator.startColling();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stopColling();
    }
}
