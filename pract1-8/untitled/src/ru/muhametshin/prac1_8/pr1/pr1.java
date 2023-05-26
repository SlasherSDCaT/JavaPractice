package ru.muhametshin.prac1_8.pr1;
import java.util.Arrays;
import java.util.function.Consumer;

public class pr1 {
    public static void main(String[] args) {

        Consumer<int[]> sort = mass -> {Arrays.sort(mass);
            System.out.println(Arrays.toString(mass));};
        int[] a = {3,1,10,5,2,4};
        sort.accept(a);
        
    }
}
