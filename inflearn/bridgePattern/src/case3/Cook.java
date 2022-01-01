package case3;

public class Cook extends IAction {
    public Cook(IRobot robot) {
        super(robot);
    }

    public void doCook(){
        System.out.println("요리를 시작합니다.");
    }
}
