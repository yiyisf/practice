package car;
/*
 */


public class EngineTest {
    public static void main(String[] args) {
//        生产引擎
        YAMAHA yamaha = new YAMAHA();
//        生产汽车
        Car car = new Car(yamaha);
//        测试引擎
        car.testEngine();

//        生产引擎
        car.e=new HONGDA();
//        测试引擎
        car.testEngine();


//        HONGDA hongda = new HONGDA();
//        Car car1 = new Car(HONGDA);
//        car1.testEngine();

    }
    

}
