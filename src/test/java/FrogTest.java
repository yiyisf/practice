import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class FrogTest {

    @Test
    @DisplayName("测试报告")
    @Description("baogaojianjie")
    @Link("https://testerhome.com")
    @Issue("123123")
    public void fun1(){
        int result = Frog.fun(5);
        System.out.println(result);
    }

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
