package case3;



public class IAction {
    private IRobot robot;

    public IAction(IRobot robot) {
        this.robot = robot;
    }

    // IRobot의 기능을 전부 똑같이 구현한다.
    void powerOn(){
        robot.powerOn();
    }

    void powerOff(){
        robot.powerOff();
    }
}
