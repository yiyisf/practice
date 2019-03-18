package pig;

/**
 * Created by liuzhe on 2019/3/17.
 */

public class Pig {
//属性
    private String name ;
//构造方法
    public Pig(String name) {
        this.name = name;
    }

//重写
    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                '}';
    }

    //方法
  void eat(Food food){
        
        System.out.printf(this.name+"吃"+food.getFood());

    }


}
