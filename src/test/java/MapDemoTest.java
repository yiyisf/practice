import org.junit.Test;

import java.util.*;

public class MapDemoTest {
    @Test
//   iterator 使⽤Iterator遍历
//   HashMap-无序存储
    public void fun1() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", "san");
        hashMap.put("age", "3");
        hashMap.put("sex", "male");
        System.out.println(hashMap);

        Iterator<Map.Entry<String, Object>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    @Test
//通过Map中的entrySet()⽅法获取存放Map.Entry<K,V>对象的Set集合。
//Set<Map.Entry<K,V>> entrySet()
//⾯向对象的思想将map集合中的键和值映射关系打包为⼀个对象,就是Map.Entry,将该对象存⼊Set集
//合，Map.Entry是⼀个对象，那么该对象具备的getKey，getValue获得键和值。
    public void fun2() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", "san");
        hashMap.put("age", "3");
        hashMap.put("sex", "male");
        System.out.println(hashMap);

        Set<Map.Entry<String, Object>> entries = hashMap.entrySet();
        for (Map.Entry en : entries) {
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }

    }

    @Test
//keySet() 获取所有键
//values()获取所有值
    public void fun3() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", "san");
        hashMap.put("age", "3");
        hashMap.put("sex", "male");
        System.out.println(hashMap);

        Set<String> strings = hashMap.keySet();
        for (String key : strings) {
            System.out.println(key);
            System.out.println(hashMap.get(key));

        }


    }

    @Test
//LinkedHashMap有序存储

    public void fun4() {
        LinkedHashMap<String, Object> linkedhashMap = new LinkedHashMap<String, Object>();
        linkedhashMap.put("name", "san");
        linkedhashMap.put("age", "3");
        linkedhashMap.put("sex", "male");
//        System.out.println(linkedhashMap);

        Set<Map.Entry<String, Object>> entries = linkedhashMap.entrySet();

        for (Map.Entry en : entries) {
            System.out.println(en.getKey());
            System.out.println(en.getValue());


        }


    }


}
