package EXCEPTION;

public class DbConnection {
    static public int count = 0;

    public static DbConnection getObject() {

        if(count > 1) {
            return null;
        }else {
            return new DbConnection();
        }

    }
    private DbConnection() {
        count++;
        System.out.println(count);
    }
}
class DbConnectionManage {

    public static void main(String[] args) {
        DbConnection db;
        for(int i=0; i < 2; i++) {
            db = DbConnection.getObject();

            if(DbConnection.count > 0) {
                throw new IllegalObjectCreation();
            }else {
                System.out.println("Object is created "+(i+1)+" time .");
            }
        }
    }
}
class IllegalObjectCreation extends RuntimeException {
    private static final long serialVersionUID = 1L;
}
