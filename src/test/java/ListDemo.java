import org.junit.Test;

import java.util.*;

public class ListDemo {
    @Test
    public void fun() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("name");
        arrayList.add("12");
        arrayList.add("sex");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    @Test
    public void fun1() {
        LinkedList<String> linkList = new LinkedList<String>();
        linkList.add("name");
        linkList.add("12");
        linkList.add("sex");

        for (int i = 0; i < linkList.size(); i++) {
            System.out.println(linkList.get(i));
        }
    }

    @Test
//    arraylist查询快，增删慢，linkedlist查询慢，增删快。在一定的插入范围内，linkedlist优于arraylist，但是在超过一个极限值以后，arraylist是优于linkedlist的。
    public void fun2() {

        long start = System.currentTimeMillis();
        LinkedList<Integer> linkList = new LinkedList<Integer>();

        for (int i = 0; i < 100000; i++) {

            linkList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void fun3() {

        long start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 100000; i++) {

            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void fun4() {

        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add("1");
        strArray.add("1");
        strArray.add("1");
        strArray.add("1");
        strArray.add("1");
        strArray.add("1");

        for (int i = 0; i < strArray.size(); i++) {

            System.out.println(strArray.get(i));
        }
    }

    @Test
    public void fun5() {
//set可以去重
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("1");
        hashSet.add("1");
        hashSet.add("1");
        hashSet.add("1");
        hashSet.add("1");
        hashSet.add("1");
        Iterator iterator = hashSet.iterator();
        if (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }

    @Test
    public void fun6() {

        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add("1");
        strArray.add("5");
        strArray.add("2");
        strArray.add("6");
        strArray.add("3");
        strArray.add("7");
        //排序
        Collections.sort(strArray);
        System.out.println(strArray);
        //反转排序
        Collections.reverse(strArray);
        System.out.println(strArray);

    }

}
