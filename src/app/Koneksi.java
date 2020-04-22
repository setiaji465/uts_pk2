package app;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Koneksi {
    public static Connection sambungDB(){
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("");
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("penitipan barang");
            dataSource.setServerTimezone("Asia/Jakarta");
            dataSource.setPortNumber(3306);
            dataSource.setAllowMultiQueries(true); 
            Connection c = dataSource.getConnection();
            return c;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    static Connection sambunganDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
