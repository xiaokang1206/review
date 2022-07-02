package jdknewcreature.Lambda;

public class lambdaDemo2 {
    public static void main(String[] args) {


        //参数类型可以省略
        useAddable((x,y)->{

            return x+y;
        });

        //参数有且仅有一个时小括号可以省略
        useFlyable(s->{
            System.out.println(s);
        });

        //代码块语句只有一条，可以省略大括号和分好
        useFlyable(s->
                System.out.println(s)
        );

        //代码块语句只有一条，可以省略大括号和分好，如果有return，return也可以省略
     useAddable((x,y)->
        x+y
        );
    }



    private  static void useAddable(Addable a){

        int sum = a.add(10, 20);
        System.out.println(sum);

    }

    private static void useFlyable(Flyable f){
        f.fly("你好啊！");

    }
}
