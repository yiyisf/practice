package Interface;

import Interface.CustomerServiceImpl;

public class CustomerServiceTest {

    public static void main(String[] args) {
//        需要执行CustomerServiceImpl中的logout方法

//        以下程序面向接口去调用
//        父类型引用CustomerService指向子类型对象CustomerServiceImpl
        CustomerServiceImpl c = new CustomerServiceImpl();//多态
//        调用
        c.logout();
    }
}
