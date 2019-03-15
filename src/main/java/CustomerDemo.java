public class CustomerDemo {
//    CustomerDemo是一个类，是一种引用类型

//    属性

//    姓名
//    成员变量、实例变量、非静态变量；
//    姓名是对象级别的，必须现有对象才能访问，不能使用类直接访问。比如CustomerDemo.name是不读的。
    String name;
//    编号
    int customer_id;
//构造函数
//    public CustomerDemo(int age) {
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age<0||this.age>100){
            System.out.println("输入年龄不合法！");
            return;
        }
        this.age = age;
    }

    //    年龄
//    int age;
    private int age;
//    性别
    boolean sex;





}
