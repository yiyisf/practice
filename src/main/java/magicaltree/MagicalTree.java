package magicaltree;

/**
 * Created by liuzhe on 2019/3/20.
 */
public class MagicalTree {

    private int total; //树上所有人参果的数目
    private int hiddenNunber;// 隐藏在土里的人参果的数目

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHiddenNunber() {
        return hiddenNunber;
    }

    public void setHiddenNunber(int hiddenNunber) {
        this.hiddenNunber = hiddenNunber;
    }

    public MagicalTree(String who) {

        System.out.printf(who);
    }



    //模拟人参果隐藏到泥土里的行为
    public void hide(int hiddenNunber){

        System.out.printf("隐藏了"+String.valueOf(hiddenNunber)+"个人参果\n");

    }

    // 模拟人参果被吃掉的行为
    public void beEaten(int total){


        System.out.printf("吃掉了"+String.valueOf(total)+"个人参果\n");
    }

    // 模拟隐藏到土里的人参果又回到树上的行为
    public void recover(int total){

        System.out.printf("恢复了"+String.valueOf(total)+"个人参果\n");
    }



}
