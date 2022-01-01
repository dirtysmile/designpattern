package case4;

public class TestPattern {
    public static void main(String[] args) {
        IRobot robot1 = new RobotModel1();
        Cook work = new Cook(robot1);
        work.powerOn();
        work.doCook();
        work.powerOff();

        System.out.println("---------------------");

        IRobot robot2 = new RobotModel2();
        Clean work2 = new Clean(robot1);
        work2.powerOn();
        work2.doClean();
        work2.powerOff();
    }
}
