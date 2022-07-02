package thread.milkDemo;

public class Producter implements Runnable {

    private Box b;
    public Producter(Box b) {
        this.b = b;
    }


    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            b.put(i);//送奶工将第i瓶奶放入奶箱
        }


    }
}
