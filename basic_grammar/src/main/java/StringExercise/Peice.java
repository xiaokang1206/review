package StringExercise;

public class Peice {
    public static void main(String[] args) {

        int[] arr= {1,2,3};

        String s = convert(arr);
        System.out.println(s);


    }


    public static String convert(int[] arr){
        String s=""; //
        s += "[";

        for(int i=0;i<arr.length;i++){
          if(i==arr.length-1){
              //最后一个元素
             s += arr[i];//一个数字拼上一个空字符，输出字符
          }else {

              s += arr[i];
              s+=",";
          }

        }
         s +="]";
        return s;
    }
}
