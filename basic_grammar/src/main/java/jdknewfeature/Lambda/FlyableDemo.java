package jdknewfeature.Lambda;

public class FlyableDemo {
    public static void main(String[] args) {

        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("hhh");
            }
        });
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("xxx");
        });

    }

    private static void useFlyable(Flyable f){
        f.fly("你好啊！");

    }
}
