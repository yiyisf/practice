public class VarTest {

    /*

变量根据出现的位置分为两种：
1、局部变量：在方法体中声明的变量叫局部变量；
2、成员变量：在类中，方法体之外声明的变量叫成员变量。

 */
    private int a;//成员变量
    private int c;//成员变量


    public static void main(String[] args) {
        VarTest v =new VarTest();
        v.fun2(8);
        v.fun1();
        v.fun();
    }

    public void fun(){
        int b=5;//局部变量
        System.out.println(b);
    }

    public void fun1(){
        System.out.println(a);
    }

    public void fun2(int c){
        //c是局部变量
        System.out.println(c);
    }
}
