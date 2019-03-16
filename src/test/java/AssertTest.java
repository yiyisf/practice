import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by liuzhe on 2019/3/15.
 */
public class AssertTest {
    @Test
    public void fun0(){
        assertEquals(2,2);
        assertEquals(3,2);
        assertEquals(5,2);
    }
    @Test
    public void fun00(){
        assertThat(1,equalTo(2));
        assertThat(1,equalTo(3));
        assertThat(1,equalTo(4));
    }
    @Rule
    public ErrorCollector errorCollector=new ErrorCollector();
    @Test
//    汇总断言失败
    public void fun000(){

        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(3));
        errorCollector.checkThat(1,equalTo(1));
    }

}
