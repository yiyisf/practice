import org.junit.Test;

import java.util.ArrayList;

public class ListDemo {
    @Test
    public void fun(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("name");
        arrayList.add("12");
        arrayList.add("sex");

        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
