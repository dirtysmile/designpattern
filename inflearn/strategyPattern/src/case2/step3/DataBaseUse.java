package case2.step3;

public class DataBaseUse {

    //접근점
    private Database db;

    public void setDatabase(Database db){
        this.db=db;
    }

    //기능 선택
    public void connect(){
        if(db==null){
            System.out.println("데이터베이스를 먼저 선택하세요");
        }else{
            db.connectDatabase();
        }
    }

    public void select(){
        db.selectData();
    }
}
