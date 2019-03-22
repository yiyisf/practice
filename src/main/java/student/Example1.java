package student;

public class Example1{
    static int v1;  //静态变量
    int  v2;  //实例变量

    void increase(){
        v1++; //相当于：v1=v1+1;
        v2++;
    }
    public static void main(String args[]){
        Example1 s1=new Example1();
        Example1 s2=new Example1();
        s1.increase();
        s2.increase();

//        System.out.println(s1.v2);
//
//        System.out.println(s2.v2);

        System.out.println(v1);

    }
}

