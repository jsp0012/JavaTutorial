    package com.company;

    import java.sql.*;

    public class Main {


        public static void main(String[] args) throws SQLException {
            Connection connection =null;
            DbHelper baglanti = new DbHelper();
            Statement st = null;
            ResultSet rs ;
            try{

                connection =baglanti.getConnection();
                System.out.println("baglanti basarili !");
                st = connection.createStatement();
                rs = st.executeQuery("SELECT * from country");// burası sql sorgusu parametresi alıp sonucu döndürür.
                //query sonucunu ekrana bastımak icin

                while(rs.next())
                {
                    System.out.println(rs.getString("name"));// country tablosundaki name sutunundaki veriler yazdırılır.
                }

            }
            catch (SQLException e) {
                baglanti.showErrorMessage(e);
            }
            finally {
                connection.close();
            }
        }
    }
