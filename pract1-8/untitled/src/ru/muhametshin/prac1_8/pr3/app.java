package ru.muhametshin.prac1_8.pr3;

public class app {
    private static final ThreadSafetySet<Integer> set = new ThreadSafetySet<>();
    private static final ThreadSafetyMap<Integer, Integer> map = new ThreadSafetyMap<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Size Map = " + map.size() + "\nSize Set = " + set.size());

        Thread first = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                set.add(i);
            }
        });
        Thread second = new Thread(()->{
            for(int i = 1000; i < 2000; i++){
                set.add(i);
            }
        });
        Thread third = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                map.put(i, i);
            }
        });
        Thread fourth = new Thread(()->{
            for(int i = 1000; i < 2000; i++){
                map.put(i, i);
            }
        });


        first.start();
        second.start();
        Thread.sleep(3000);

        third.start();
        fourth.start();
        Thread.sleep(3000);

        System.out.println("Size Map = " + map.size() + "\nSize Set = " + set.size());

    }
}
