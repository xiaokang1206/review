package thread;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        MyThread myThread1=new MyThread();
      //  myThread.run();
       // myThread1.run();
        myThread.setName("汽车");
        myThread1.setName("飞机");

        myThread.start();

        myThread1.start();



    }
}
