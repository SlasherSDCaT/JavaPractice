package ru.muhametshin.prac1_8.pr8.Mediator;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    Mediator(){
        button = new Button();
        powerSupplier = new PowerSupplier();
    }

    public void press(){
        if(fan.isOn){
            fan.turnOff();
        }else{
            fan.turnOn();
        }
    }

    public void startColling(){
        powerSupplier.turnOn();
    }
    public void stopColling(){
        powerSupplier.turnOff();
    }
}
