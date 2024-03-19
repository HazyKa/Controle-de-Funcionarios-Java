package br.com.michel.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory{
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/xempresa";

    public static Connection createConnectionSQL() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }

    public static void main(String[] args) throws Exception{
        Connection conn = createConnectionSQL();

        if(conn != null){
            conn.close();
        }
    }
}