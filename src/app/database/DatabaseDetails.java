package app.database;

import java.sql.*;

public class DatabaseDetails {


    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/music_shop_managment", "root", "AbbeyRoad69");
    }
}
