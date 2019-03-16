import org.junit.Test;

import java.io.*;

public class ReadDemoTest {
    @Test
//    读取文件-字符流-基础流
    public void fun() throws Exception{
        FileReader fR = new FileReader("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\1.txt");
//        int read = fR.read();
        int num = 0;
        while ((num=fR.read())!=-1){
            System.out.println((char)num);
        }
        fR.close();



    }

    @Test
    public void fun1() {
//写入文件-字符流-基础流
        FileWriter fileWriter =null;
        try {
//            参数后面加true表示可以追加输入内容
            fileWriter = new FileWriter("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\2.txt",true);
            fileWriter.write("丹丹丹丹丹丹");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    @Test
    public void fun2() throws Exception{
//        读取文件-字符流-缓冲流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\2.txt"));
//        bufferedReader.read();
//        System.out.println((char) bufferedReader.read());
//        System.out.println( bufferedReader.readLine());
        String data=null;
        while ((data=bufferedReader.readLine())!=null){
            System.out.println(data);
        }


    }

    @Test
    public void fun3(){
//        写入文件-字符流-缓冲流
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\2.txt",true));
            bufferedWriter.write("老杨老杨老杨老杨");
            bufferedWriter.newLine();
            bufferedWriter.write("dandandandandandan");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }



}