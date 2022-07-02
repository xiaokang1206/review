package thread.milkDemo;

public class BoxDemo {
    public static void main(String[] args) {

        Box box=new Box();
        Customer customer=new Customer(box);
        Producter producter=new Producter(box);

        Thread t1=new Thread(customer);
        Thread t2=new Thread(producter);


        t1.start();
        t2.start();



    }
}
