import org.junit.Test;

public class FrogTest {
    @Test
    public void fun1(){
        int result = Frog.fun(5);
        System.out.println(result);
    }

    @Test
    public void fun2(){
        int result = Frog.fun(-1);
        System.out.println(result);
    }

    @Test
    public void fun3(){
        int result = Frog.fun(0);
        System.out.println(result);
    }

    @Test
    public void fun4(){
        int result = Frog.fun(1);
        System.out.println(result);
    }

    @Test
    public void fun5(){
        int result = Frog.fun(1000000);
        System.out.println(result);
    }



}
