package magicTree;

/**
 * Created by liuzhe on 2019/3/20.
 */
public class TreeTest {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.beEaten(1);//吃掉一个

        tree.beEaten(1);

        tree.hide("hahaha",1);

        tree.beEaten(3);

        tree.hideAll();

        tree.recover(28);
//        tree.recover(Tree.total1);

    }

}
