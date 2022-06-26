package GeneralAPI;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arry={22,63,55,10,32,5};
         // getMax(arry);
         // Arrays.sort(arry);//从小到大
        //从大到小
          for (int i=0 ;i<arry.length-1;i++){
            for(int j=0;j<arry.length-1-i;j++){
                if(arry[i]<arry[i+1]){
                    int min =arry[i];
                    arry[i]=arry[i+1];
                    arry[i+1]=min;
                }
            }

          }
        System.out.println(Arrays.toString(arry));



    }

    public static void getMax(int[] arry){

        for(int i=0;i<arry.length-1;i++){
           //比较次数
            for(int j=0;j<arry.length-1-i;j++){
                //取出数组中的元素进行比较
                // 每比较完一轮，都会把最大的数放最后，因此下一次比较时，最大的数不参与比较
                //比如第一次需要比较n-1次  第二次需要比较n-2次
                if(arry[j]>arry[j+1]){
                    int max =arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=max;
                }
            }
        }
        System.out.println(Arrays.toString(arry));




    }
}
