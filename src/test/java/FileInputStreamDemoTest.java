import org.junit.Test;

import java.io.*;

public class FileInputStreamDemoTest {
    @Test
//    读取文件-字节流
    public void fun() throws Exception{
        FileInputStream fir = new FileInputStream("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\1.txt");
//        int read = fR.read();
        int num = 0;
        while ((num=fir.read())!=-1){
            System.out.println((char)num);
        }
        fir.close();



    }

    @Test
    public void fun1() {
//写入文件-字节流
        FileOutputStream fos =null;
        try {
//            参数后面加true表示可以追加输入内容
            fos = new FileOutputStream("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\2.txt",true);
            fos.write("dandandan".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    @Test
    public void fun2() throws Exception{
//        读取文件-字节流-缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\2.txt"));
        byte[] bt =new byte[1024*10];
        int num=0;
        while ((num=bis.read(bt))!=-1){
            System.out.println((new String(bt,0,num)));
        }
        bis.close();

    }

    @Test
    public void fun3(){
//        写入文件-字节流-缓冲流
        try {
            BufferedOutputStream bos;
            bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\2.txt",true));
            bos.write("老杨老杨老杨老杨".getBytes());
            bos.write("dandandandandandan".getBytes());
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }



}