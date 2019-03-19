package weapon;

/**
 * Created by liuzhe on 2019/3/19.
 */
public class WeaponTest {
    public static void main(String[] args) {

        Monkey owner =new Monkey();
        owner.setName("孙悟空");
//        System.out.printf(owner.getName());

        Weapon weapon1 = new Weapon("金箍棒");
        weapon1.setLength(7);
        weapon1.setWeight(67500);
        weapon1.setStretchable(true);
        weapon1.setMadein("donghai");

        weapon1.setOwner(owner);


        weapon1.print();




        owner.setName("智多星");
        Weapon weapon2 = new Weapon("流星剑");
        weapon2.setLength(1);
        weapon2.setWeight(502);
        weapon2.setStretchable(false);
        weapon2.setMadein("huaguoshan");

//        weapon1.print();
    }
}
