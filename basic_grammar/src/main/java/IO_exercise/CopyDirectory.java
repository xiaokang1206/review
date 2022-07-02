package IO_exercise;

import java.io.*;

public class CopyDirectory {
    public static void main(String[] args) throws IOException {

        File src=new File("D:\\io_test\\io_source");
        File dest=new File("D:\\io_test\\io_target");

        copyFloder(src,dest);
    }

    private static void copyFloder(File src, File dest) throws IOException {
        if(src.isDirectory()){
            //是目录
            String srcName = src.getName();//获取目录的名字，在目的目录下创建一个同样的目录
            File newFloder=new File(dest,srcName);
            //判断该目录是否存在,不存在则创建
            if(!newFloder.exists()){
                newFloder.mkdir();
            }
            File[] files = src.listFiles();//遍历源目录
            for (File file : files) {
                //遍历目录，判断源目录下是文件还是目录
                    copyFloder(file,newFloder);
                }
            }else {
            //是文件，直接复制
            File newFile =new File(dest,src.getName());
            copyFile(src,newFile);

        }


        }





    //复制文件夹


    //复制文件
private  static void copyFile(File src,File dest) throws IOException {
    BufferedInputStream bf=new BufferedInputStream(new FileInputStream(src));
    BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(dest));

    byte[] bytes=new byte[1024];

    int len;
    while ((len=bf.read(bytes))!=-1){
        bo.write(bytes,0,len);
    }


}

}
