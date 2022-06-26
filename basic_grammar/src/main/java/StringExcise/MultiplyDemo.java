package StringExcise;

public class MultiplyDemo {
    public static void main(String[] args) {
        //外层循环用于显示层数
        for (int i =1; i<=9;i++ ){
            for(int j=1 ;j<=i;j++){
       //内层循环用于定义每层两数相乘的次数
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }
                 System.out.print("\n");
        }
    }
}
