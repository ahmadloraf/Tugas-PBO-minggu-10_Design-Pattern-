package TugasMinggu10.Singleton;

public class DatabaseHelper {

    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            connection = new Connection("localhost", "root", "username");
        }
        return connection;
    }
}
