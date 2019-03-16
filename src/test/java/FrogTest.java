import org.junit.Test;

public class FrogTest {

//    @Test
//    @DisplayName("小青蛙跳5级台阶")
//    @Description("看看小青蛙是怎么跳五级台阶的呢？娃哈哈。。。")
//    @Link("https://testerhome.com")
//    @Issue("/topics/17377")
//    @Severity(SeverityLevel.CRITICAL)
//
//    @Step("小青蛙还没有开始跳")
////    @Attachment()截图
//    public void fun0(){
//        System.out.println("11111111111");
////        Allure.addAttachment("page screenshot","png","C:\\Users\\sandra\\Desktop\\图片-750 326\\Layer 0 (3).png");
//        try {
//            Allure.addAttachment("page screenshot","png", new FileInputStream("C:\\Users\\sandra\\Desktop\\图片-750 326\\Layer 0 (3).png"),".png");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void fun1(){
//        int result = Frog.fun(5);
////        fun0();
//        System.out.println(result);
//
////        动态添加日志
//        StepResult stepResult = new StepResult();
//        stepResult.setName("step name");
//        stepResult.setStatus(Status.PASSED);
//        Allure.getLifecycle().startStep("new step",stepResult);
//        Allure.getLifecycle().stopStep();
//
//
//
//    }

    @Test
    public void fun2(){
        int result = Frog.fun(-1);
        System.out.println(result);
    }

    @Test
    public void fun3(){
        int result = Frog.fun(0);
        System.out.println(result);
    }

    @Test
    public void fun4(){
        int result = Frog.fun(1);
        System.out.println(result);
    }

    @Test
    public void fun5(){
        int result = Frog.fun(10);
        System.out.println(result);
    }



}
