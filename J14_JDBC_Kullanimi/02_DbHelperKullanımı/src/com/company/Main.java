    package com.company;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class Main {


        public static void main(String[] args) throws SQLException {
            Connection connection =null;
            DbHelper baglanti = new DbHelper();
            try{

                connection =baglanti.getConnection();
                System.out.println("baglanti basarili !");
            }
            catch (SQLException e) {
                baglanti.showErrorMessage(e);
            }
            finally {
                connection.close();
            }
        }
    }
