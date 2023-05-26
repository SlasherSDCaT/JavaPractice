package ru.muhametshin.prac1_8.pr5;

public class FirstSingleton {
    private static FirstSingleton firstSingleton;
    public static synchronized FirstSingleton getFirstSingleton(){
        if(firstSingleton == null){
            firstSingleton = new FirstSingleton();
            return firstSingleton;
        }
        return firstSingleton;
    }

    private FirstSingleton(){}
}
