package case2.step3;

public class TestPattern {
    public static void main(String[] args) {

        //데이터베이스를 전략적으로 선택하여 사용한다.
        DataBaseUse myDB = new DataBaseUse();
        myDB.connect();

        //A(Database)에게 같을 일을 시켰지만 동작은 B(mysql)가 한다.
        myDB.setDatabase(new MySQL());
        myDB.connect();
        myDB.select();

        //A(Database)에게 같을 일을 시켰지만 동작은 B(Informix)가 한다.
        myDB.setDatabase(new Informix());
        myDB.connect();
        myDB.select();

        //A(Database)에게 같을 일을 시켰지만 동작은 B(Oracle)가 한다.
        myDB.setDatabase(new Oracle());
        myDB.connect();
        myDB.select();


    }
}
