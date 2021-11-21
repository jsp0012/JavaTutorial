    package com.company;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class Main {

        static String userName = "root";
        static String password = "1234";
        static String dbUrl = "jdbc:mysql://localhost:3306/world"; // veri tabanı baglantı stringi localhost:portname/dbname
        public static void main(String[] args) throws SQLException {
            Connection connection =null;

            try{
                connection = DriverManager.getConnection(dbUrl,userName,password);
                System.out.println("baglanti basarili !");
            }
            catch (SQLException e) {
                System.out.println("hata olustu:-> "+e.getMessage());
            }
            finally {
                connection.close();
            }
        }
    }
