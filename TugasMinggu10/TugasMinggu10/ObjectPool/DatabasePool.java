package TugasMinggu10.ObjectPool;


import TugasMinggu10.Singleton.Connection;

import java.util.ArrayList;
import java.util.List;

public class DatabasePool {

    private static List<Connection> pool = new ArrayList<>();

    static {
        for (int i = 0;  i < 100 ; i++){
            Connection connection = new Connection("localhost", "root", "password");
            pool.add(connection);
        }
    }

    public static Connection getConnection(){
        if (pool.isEmpty()){
            throw new RuntimeException("Koneksi nya abis :(");
        }else{
            Connection connection = pool.remove(0);
            return connection;
        }
    }

    public static void close(Connection connection){
        pool.add(connection);
    }



}
