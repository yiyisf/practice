public class CustomerTest  {
    public static void main(String[] args) {
//        1、创建CustomerDemo类对象
        CustomerDemo customerDemo = new CustomerDemo();

//        2、读取
//        System.out.println(customerDemo.name);
//        System.out.println(customerDemo.age);
//        3、赋值
//        customerDemo.name="yang lao shi";
        customerDemo.setAge(-150);
        int age = customerDemo.getAge();
//        customerDemo.age=-18;//因为age属性没有任何限制，导致外部程序可以随意访问，导致age不安全。//不合法的数据。
//        4、读取
//        System.out.println(customerDemo.name);
        System.out.println(age);

    }

}
