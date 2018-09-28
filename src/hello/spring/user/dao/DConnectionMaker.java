package hello.spring.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection c = DriverManager.getConnection(
            "jdbc:sqlite:/C:\\Users\\SanghoSeo-DigiCAP\\Documents\\HelloSpring\\local.db"
        );

        return c;
    }
}
