package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket2 implements Runnable  {

    private static int tickets = 100;
    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if(tickets>0) {


                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "这是第：" + tickets + "张票");
                    tickets--;
                }
            }finally {
                lock.unlock();
            }






        }

    }


}
