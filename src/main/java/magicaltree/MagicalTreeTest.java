package magicaltree;

/**
 * Created by liuzhe on 2019/3/20.
 */
public class MagicalTreeTest {

    public static void main(String[] args) {

        MagicalTree magicalTree1 = new MagicalTree("tongzi1");
        magicalTree1.beEaten(1);
        magicalTree1.setTotal(1);



        MagicalTree magicalTree2 = new MagicalTree("tongzi2");
        magicalTree2.beEaten(1);
        magicalTree2.setTotal(1);

        MagicalTree magicalTree3 = new MagicalTree("孙悟空");
        magicalTree3.hide(1);
        magicalTree3.setHiddenNunber(1);

        MagicalTree magicalTree4 = new MagicalTree("孙悟空");
        magicalTree4.beEaten(1);
        magicalTree4.setTotal(1);
        MagicalTree magicalTree5 = new MagicalTree("猪八戒");
        magicalTree5.beEaten(1);
        magicalTree5.setTotal(1);
        MagicalTree magicalTree6 = new MagicalTree("沙僧");
        magicalTree6.beEaten(1);
        magicalTree6.setTotal(1);

        MagicalTree magicalTree7 = new MagicalTree("孙悟空");
        magicalTree7.hide(22);
        magicalTree7.setHiddenNunber(22);


        MagicalTree magicalTree8 = new MagicalTree("观音菩萨");
        magicalTree8.recover(28);
        magicalTree8.setTotal(28);
//




    }

}
