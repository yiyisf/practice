
import org.junit.Test;
public class Base_Type {

    int i ;

    @Test
    public void fun(){
        System.out.println("默认值为:"+i);

    }

    @Test
    public void fun1(){
        i = 3;
        System.out.println("赋值后为:"+i);

    }

    @Test
    public void fun2(){
        int a = 3;
        int b = 4;
        System.out.println("a+b="+(a+b));

    }

    @Test
    public void fun3(){
        int a = 3;
        System.out.println("++a="+(++a));
    }

    @Test
    public void fun4(){
        int a = 11;
        if (a>10){
            System.out.println("a是大于10的");}
        else {
            System.out.println("a是小于10的");}
        }
    @Test
    public void fun5(){
        int a = -11;
        if(a>10){
            System.out.println("a是大于10的");
        }else if (a==10){
            System.out.println("a是小于10的");
        }else if(a>0&&a<10){
            System.out.println("a是小于10&&大于0的");
        }else {
            System.out.println("a是小于0的");
        }
    }

    @Test
    public void fun6(){
        int a = 11;
        int b = -20;
        if (a>0 | b>0){
            System.out.println("a或者B总有一个大于0的");}

    }
















}
