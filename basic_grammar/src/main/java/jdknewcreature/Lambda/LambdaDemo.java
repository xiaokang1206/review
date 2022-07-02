package jdknewcreature.Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
//匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程开起了");
            }
        }).start();
//lambda
new Thread(() ->{
    System.out.println("多线程开启2");
}).start();




    }
}
