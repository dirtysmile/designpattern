package case3;

public class TestPattern {
    public static void main(String[] args) {
        IRobot robot1 = new RobotModel1();
        Cook work = new Cook(robot1);
        work.powerOn();
        work.doCook();
        work.powerOff();

        System.out.println("---------------------");

        robot1 = new RobotModel2();
        work = new Cook(robot1);
        work.powerOn();
        work.doCook();
        work.powerOff();
    }
}
