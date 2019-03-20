package magicTree;

/**
 * Created by liuzhe on 2019/3/20.
 */
public class Tree {

//    public static Integer total1=28;
    private  Integer total;
    private Integer hideNum;

//    public Tree(int i) {
//    }

    public Tree() {
        this.total = 28;
        this.hideNum = 0;
    }

    public void hide(String who,Integer i) {
        if (this.total - i >= 0) {
            this.total = this.total - i;
            this.hideNum = this.hideNum + i;
            System.out.println(who+"掉土里" + i + "个！");
        } else {
            System.out.println("树空了，没得吃了！");
        }
    }


    public void recover(Integer i) {
        this.total += i;
        this.hideNum -= i;
        System.out.println("恢复了" + i + "个，现在有" + total + "个了!");
    }

    public void beEaten(int i) {
        total = total - i;
        System.out.println("吃掉了" + i + "个");
    }


    public void hideAll() {
        this.hideNum += this.total;
        this.total = 0;
        System.out.println("树上空了，土里有"+ this.hideNum+"个！");
    }
}
