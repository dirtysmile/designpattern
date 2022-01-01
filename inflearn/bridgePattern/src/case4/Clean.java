package case4;

public class Clean extends IAction {
    public Clean(IRobot robot) {
        super(robot);
    }

    public void doClean(){
        System.out.println("청소를 시작합니다.");
    }
}
