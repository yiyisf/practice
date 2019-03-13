
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
        int b = 4;
        System.out.println("++a="+(++a));
    }

    


}
