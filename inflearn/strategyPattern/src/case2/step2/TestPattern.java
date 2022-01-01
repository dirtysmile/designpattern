package case2.step2;

public class TestPattern {
    public static void main(String[] args) {
        DataBaseUse myDB = new DataBaseUse();

        //데이터 베이스를 세팅한다.
        myDB.connect(DBTYPE.MySQL);
        myDB.select();

        //데이터 베이스를 세팅한다.
        myDB.connect(DBTYPE.Informix);
        myDB.select();

        //[ 추가 요청 사항 ]
        // Oracle 클래스를 추가하고 세팅하여 사용하라
        myDB.connect(DBTYPE.Oracle);
        myDB.select();
    }
}
