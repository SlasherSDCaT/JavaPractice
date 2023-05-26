package ru.muhametshin.prac1_8.pr2;

import java.time.LocalDate;

public class Human implements Comparable<Human>{
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;

    Human(int age, String firstName, String lastName, LocalDate birthDate, int weight){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Human o) {
       if(this.weight > o.weight){
           return -1;
       } else if (this.weight < o.weight) {
           return 1;
       }else {
           return 0;
       }
    }
}
