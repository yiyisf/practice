/*
接口是一种引用类型，可以等同看作类。
1、如何定义接口，语法：
{修饰符} interface 接口名()
2、接口中只能出现常量和抽象方法；
3、接口是一个特殊的抽象类，特殊在接口是完全抽象的；
    void m2(){};  不能加主体{}
4、接口中没有构造方法，接口也无法被实例化；
     A(){};不能构造方法
5、接口和接口之间可以多继承；
6、一个类可以实现多个接口（这里的实现可以等同看作“继承”）；
7、一个非抽象的类实现接口，需要将接口中所有的方法“实现、重写、覆盖”。
     */
public interface A {
//    常量
    public static final String s = "string";
    public static final double d = 3.14;
    byte b = 127;//默认使用了public static final

//    抽象方法:接口中所有的抽象方法都是public abstract
    public abstract void m1();
    void m2();

    interface B {
        public abstract void m1();
    }
    interface C {
        void m2();
    }
    interface D {
        void m3();
    }
//    接口和接口之间可以多继承
    interface E extends B,C,D{
        void m4();
    }

//    implements是一个关键字，是实现的意思
//    implements和extends意义相同，但extends已经写死了，是单继承。
//    一个类可以实现多个接口
    class MyClass implements B,C{
    public void m1() {

    }

    public void m2(){

    }

    class F implements E{
        public void m1() {

        }

        public void m2() {

        }

        public void m3() {

        }

        public void m4() {

        }
    }
}





}
