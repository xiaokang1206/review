package thread.milkDemo;

public class Box {
    private int milk;//表示第x瓶奶

    //定义一个成员变量，表示奶箱的状态
    private boolean state = false;

    //取牛奶
    public synchronized void put(int milk) {
        //有牛奶
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");


        //生产完毕之后，修改奶箱状态
        state = true;
        //唤醒其他等待的线程
        notifyAll();
    }
    //拿牛奶
    public synchronized void get(){
        //如果没有牛奶，等待生产
        if(!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("客户拿到第" + this.milk + "瓶奶");

        //消费完毕之后，修改奶箱状态
        state = false;

        //唤醒其他等待的线程
        notifyAll();
    }


}
