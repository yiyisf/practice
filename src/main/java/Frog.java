public class Frog {
//题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
//    f(0)=0
//    f(1)=1
//    f(n)=f(n-1)+f(n-2)  n>=2

//    private int id;
//    private String name;

    public static void main(String[] args) {
//        Frog f = new Frog();
//        f.id = 123;
//        System.out.println(f.id);

        int fun = fun(10);
        System.out.println(fun);
    }

    public static int fun(int a) {
        if (a <= 0) {
            return 0;
        } else if (a == 1 || a == 2) {
            return a;
        } else {
            return fun(a-1)+fun(a-2);
        }

    }
}
