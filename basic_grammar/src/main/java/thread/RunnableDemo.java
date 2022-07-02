package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RunnableDemo {
    public static void main(String[] args) {

MyRunnable my=new MyRunnable();
SellTicket st=new SellTicket();



        Thread t1=new Thread(st,"窗口1");
        Thread t2=new Thread(st,"窗口2");
        Thread t3=new Thread(st,"窗口3");



        t1.start();
        t2.start();
        t3.start();





    }
}
