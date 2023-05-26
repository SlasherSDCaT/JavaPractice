package ru.muhametshin.prac1_8.pr6;


class Person{
    int age;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

interface AbstractBuilder{
    Person build();
    AbstractBuilder setAge(int age);
    AbstractBuilder setName(String name);
}

class PersonBuilder implements AbstractBuilder{
    Person person = new Person();
    @Override
    public Person build() {
        return person;
    }

    @Override
    public AbstractBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public AbstractBuilder setName(String name) {
        person.name = name;
        return this;
    }
}

public class Builder {
    public static void main(String[] args) {
        Person person = new PersonBuilder().setAge(10).setName("John").build();
        System.out.println(person.toString());
    }
}
