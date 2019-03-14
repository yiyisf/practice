import org.junit.Test;

//        f(0)=0;
//        f(1)=1;
//        f(2)=2;
//        f(n)=f(n-1)+f(n-2) n>=2;
public class FrogTest {
//    public int m =0;
//    public int n=0;

    @Test
    public int fun() {
        int a;
        if (a <= 0) {
            return 0;
//            System.out.println(0);
        } else if (a == 1 || a == 2) {
            return a;
//            System.out.println(a);
        } else {
//            m = fun(a-1);
//            n = fun(a-2);
            return fun(a-1)+fun(a-2);
//            System.out.println(fun(a-1));

        }

    }


}
