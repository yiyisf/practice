public class StudentTest01 {

    public static void main(String[] args) {

//      创建对象
//      stu是一个局部变量，是StudentDemo类型，是一个引用变量
//      使用stu这个局部变量称作引用，引用保存了对象在堆中的内存地址
//      通过引用去间接访问
//      一个类型可以创建多个对象
        StudentDemo stu= new StudentDemo();

//      使用对象
//      id是成员变量
//      访问成员变量，必须使用引用
//      必须先有对象才能访问
        System.out.println(stu.id);

//      赋值
        stu.id=10;
        stu.age=10;
        stu.name="zhang san";
        stu.sex=false;
        stu.address="shen zen";

        System.out.println(stu.id);


    }
}
