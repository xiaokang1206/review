package IO_exercise;

import java.io.File;

//不死神兔，求第20个月的兔子对数
//每个月兔子对数 ：1,1,2,3,5,8
public class DiGuiDemo {
    public static void main(String[] args) {


      //  System.out.println(f(20));//把f方法调用20次

        System.out.println( multiple(5));//递归求5的阶层

        File f1=new File("D:\\io_test");
        find(f1);//找到目录下的所有文件

    }
public static int f(int n){

        if(n==1 || n==2){
            return 1;//第一二个月
        }else {

            return f(n - 1) + f(n - 2);
        }

}

    public static int multiple(int n) {
        if (n == 1) {
            return 1;
        }

        return n *multiple( (n - 1));
    }
    public static void find(File file) {
        File[] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {

                if (file1.isDirectory()){
                    //是目录
                    find(file1);

                }else {
                    //不是文件夹输出
                    System.out.println(file1.getAbsoluteFile());
                }

            }


        }



    }
}
