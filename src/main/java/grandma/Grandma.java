package grandma;

public class Grandma {
    private String name=null;
    private int age=0;

    public Grandma(String name, int age) {
        this.name = name;
        this.age = age;
        if(this.age>=0&&this.age<120){
            System.out.println(this.name+"今年"+this.age+"岁了！");
        }else {
            System.out.println("年龄输入错误，请重新输入！");

        }



    }


    public void Eat(String food){
        System.out.println(this.name+"爱吃饭："+food);

    }

    public void Add(int a,int b){
        int sum =a+b;
        System.out.println(this.name+"会算术："+"a+b="+ sum);

    }

}
