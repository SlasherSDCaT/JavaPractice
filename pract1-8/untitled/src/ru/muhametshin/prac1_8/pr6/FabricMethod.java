package ru.muhametshin.prac1_8.pr6;

interface Product{
    void doStuff();
}

class productA implements Product{

    @Override
    public void doStuff() {
        System.out.println("Product A is doing some stuff");
    }
}

class productB implements Product{
    @Override
    public void doStuff() {
        System.out.println("Product B is doing some stuff");
    }
}

abstract class Creator{

    void doOperations(){
        Product p = createProduct();
        p.doStuff();
    }
    abstract public Product createProduct();
}

class CreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new productA();
    }
}

class CreatorB extends Creator {

    @Override
    public Product createProduct() {
        return new productB();
    }
}
public class FabricMethod {
    public static void main(String[] args) {
        Creator creator = new CreatorA();
        creator.doOperations();
    }
}
