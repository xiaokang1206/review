package StringExercise;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {

    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(100) + 1;//产生0~100的随机数
        System.out.println("请输入你要猜的数字：");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int guessnumber = sc.nextInt();
            if (guessnumber > i) {
                System.out.println("你猜的数字大了");
            } else if (guessnumber < i) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }

        }

    }

}
