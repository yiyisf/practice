import org.junit.Test;

//        f(0)=0;
//        f(1)=1;
//        f(2)=2;
//        f(n)=f(n-1)+f(n-2) n>=2;
public class FrogTest {

    @Test
    public void fun2() {
        int result = fun(4);
        System.out.println(result);
    }

    public int fun(int a) {
        if (a <= 0) {
            return 0;
        } else if (a == 1 || a == 2) {
            return a;
        } else {
            return fun(a-1)+fun(a-2);
        }

    }





}
