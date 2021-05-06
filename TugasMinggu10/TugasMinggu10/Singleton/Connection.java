package TugasMinggu10.Singleton;

import java.util.List;

public class Connection {

    String host;
    String username;
    String password;

    public Connection(String host, String name, String pass){
        this.host = host;
        username = name;
        password = pass;
    }

    public String sql(String sql, String id, String name, Integer price) {
        return null;
    }

    public List<Object[]> select(String sql) {
        return null;
    }
}
