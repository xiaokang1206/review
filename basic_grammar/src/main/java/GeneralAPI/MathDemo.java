package GeneralAPI;

public class MathDemo {
    public static void main(String[] args) {

        Math.abs(-10);//去绝对值
        Math.min(2,3);//返回两个数中的最小值
        Math.round(2.33);//返回四舍五入后的值
        Math.floor(12.3);//向下取整
        Math.ceil(12.3);//向上取整
        Math.pow(2.0,3.0);//返回a的b次幂
        Math.random();//返回0~1.0之间的小数


     //   System.exit(0);
        long l = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365);
    }
}
