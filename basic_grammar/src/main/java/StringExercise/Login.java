package StringExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String username = "itheima";
        String password = "zxcv";
        Scanner sc =new Scanner(System.in);



        int count = 3;
        for(int i=0;i<3;i++){
            System.out.println("请输入用户名：");
            String user = sc.nextLine();



            System.out.println("请输入密码：");
            String pass=sc.nextLine();
            count--;
            if(pass.equals(password)&&username.equals(user)){
                System.out.println("成功登录");
                break;
            }else {
                   if(count==0){
                       System.out.println("账户锁定");
                   }else {
                       System.out.println("登录失败你还有" + count + "次机会");
                   }
            }

        }

    }
}
