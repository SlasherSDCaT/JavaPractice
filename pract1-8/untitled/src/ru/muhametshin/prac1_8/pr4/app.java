package ru.muhametshin.prac1_8.pr4;



public class app {
    public static void main(String[] args) throws InterruptedException {
        MyExecutorService executorService = new MyExecutorService(2);
        for(int i = 0; i < 20; i++){
            executorService.submit(()->{
                System.out.println("A");
            });
            executorService.submit(()->{
                System.out.println("B");
            });
            Thread.sleep(3000);
            executorService.submit(()->{
                System.out.println("C");
            });
            executorService.submit(()->{
                System.out.println("D");
            });

        }
        executorService.submit(()->{
            System.out.println("FINISH");
        });
        executorService.shutdown();
    }
}
