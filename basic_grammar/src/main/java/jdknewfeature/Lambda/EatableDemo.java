package jdknewfeature.Lambda;

public class EatableDemo {
    public static void main(String[] args) {

        Eatable e=new EatableImpl();
        useEatable(e);

        //匿名内部类
        new Eatable(){

            @Override
            public void eat() {
                System.out.println("一天一槟榔");
            }
        }.eat();

        useEatable(()->{});
    }

    private static void useEatable(Eatable e){

        e.eat();
    }
}
