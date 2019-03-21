package grandma;

public class GrandmaTest {
    public static void main(String[] args) {
        Grandma grandma = new Grandma("body奶奶",101);
        grandma.Eat("辣椒炒肉");
        grandma.Add(1,2);

        Grandma grandma1 = new Grandma("杨龙奶奶",88);
        grandma1.Eat("番茄炒蛋");
        grandma1.Add(3,5);

        Grandma grandma2 = new Grandma("丹丹奶奶",-92);
        grandma2.Eat("鱼香肉丝");
        grandma2.Add(100,200);

    }
}
