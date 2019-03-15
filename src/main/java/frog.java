public class frog {
    private int id;
    private String name;

    public  void main(String[] args) {
//        frog f = new frog();
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
