    package com.company;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class DbHelper {
        private String userName = "root";
        private String password = "1234";
        private String dbUrl = "jdbc:mysql://localhost:3306/world"; // veri tabanı baglantı stringi localhost:portname/dbname


        public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(dbUrl,userName,password);
        }

        public void showErrorMessage(SQLException e)
        {
            System.out.println("Error: "+ e.getMessage());
        }
    }
