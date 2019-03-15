import org.junit.Test;

import java.util.Arrays;

public class ArrayDemoTest {
    @Test
    public void fun() {
        int[] ArrayInt = {1, 1, 3, 2, 9};
//数组排序
        Arrays.sort(ArrayInt);
//      System.out.println(ArrayInt);
//数组转string
        System.out.println(Arrays.toString(ArrayInt));


        for (int i = 0; i < ArrayInt.length; i++) {
            System.out.println(ArrayInt[i]);

        }
    }
}
