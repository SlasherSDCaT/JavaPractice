package ru.muhametshin.prac1_8.pr5;

public class app {
    public static void main(String[] args) {
        System.out.println(FirstSingleton.getFirstSingleton().toString());
        System.out.println(FirstSingleton.getFirstSingleton().toString());
        System.out.println(SecondSingleton.singleton.toString());
        System.out.println(SecondSingleton.singleton.toString());
        System.out.println(ThirdSingleton.getInstance().toString());
        System.out.println(ThirdSingleton.getInstance().toString());

    }
}
