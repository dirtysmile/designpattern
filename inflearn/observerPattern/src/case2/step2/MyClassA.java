package case2.step2;

public class MyClassA implements Observer {

    Publisher observable; //등록될 Observable
    private boolean bPlay;

    public MyClassA(Publisher observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    public void myActControl(){
        if(bPlay){
            System.out.println("MyClassA : 동작을 시작합니다.");
        }else{
            System.out.println("MyClassA : 동작을 정지합니다.");
        }
    }
}
