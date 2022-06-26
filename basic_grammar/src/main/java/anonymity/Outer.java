package anonymity;

public class Outer {
    //定义匿名内部类

    public void method(){

        new Inter(){
            public void show() {
                System.out.println("匿名内部类");
            }
        };//此处的new Inter 相当于是Inter的实现类对象，只不过该对象没有对象名

        new Inter(){
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        Inter inter=new Inter(){
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        inter.show();//使用多态形式调用方法

    }

}
