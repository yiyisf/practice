package robot;

/**
 * Created by liuzhe on 2019/3/21.
 */
public class RobotTest {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.isCheaper(3.4,4.5);
        robot.totalAmount(4.45333,3);
        robot.isYear(2019);
        robot.encrypt(1234);

        System.out.printf(String.valueOf(robot.isCheaper(3.4,4.5))+'\n');
        System.out.printf(String.valueOf(robot.totalAmount(4.45333,3))+'\n');
        System.out.printf(String.valueOf(robot.isYear(2019))+'\n');
        System.out.printf(String.valueOf(robot.encrypt(1234))+'\n');
    }
}
