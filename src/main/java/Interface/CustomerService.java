package Interface;

/*
客户业务接口
1、可以使项目分层，所有层都面向接口开发，开发效率提高了。
2、接口使代码和代码之间耦合度降低了。
接口和抽象类都能完成某个功能的时候，优先选择接口。
接口可多实现、多继承
并且一个类除了接口外，还可以继承其它类
* */
public interface CustomerService {

//    定义一个退出系统的抽象方法
    public abstract void logout();
}
