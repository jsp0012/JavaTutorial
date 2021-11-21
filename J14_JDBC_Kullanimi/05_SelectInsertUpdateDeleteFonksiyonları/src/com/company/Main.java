package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    static Connection connection = null;
    static DbHelper baglanti = new DbHelper();

    public static void main(String[] args) throws SQLException {
        InsertQuery();
        //UpdateQuery();
        //DeleteQuery();
    }


    public static void selectQuery() throws SQLException {
        Statement st = null;
        ResultSet rs;
        try {
            connection = baglanti.getConnection();
            System.out.println("baglanti basarili !");
            st = connection.createStatement();
            rs = st.executeQuery("SELECT * from country");

            ArrayList<Country> ulkeler = new ArrayList<Country>();

            while (rs.next()) {
                ulkeler.add(new Country(
                        rs.getString("code"),
                        rs.getString("name"),
                        rs.getString("continent"),
                        rs.getString("region")));
            }
            System.out.println("------Arraylist Boyutu------");
            System.out.println(ulkeler.size());
        } catch (SQLException e) {
            baglanti.showErrorMessage(e);
        } finally {
            st.close();
            connection.close();
        }
    }

    public static void InsertQuery() throws SQLException {
        DbHelper baglanti = new DbHelper();
        PreparedStatement st = null;
        try {
            connection = baglanti.getConnection();

            //degerler biliniyorsa asagıdaki satır ile ekleme yapılabilir.
            st = connection.prepareStatement("insert into city (Name,CountryCode,District,Population) VALUES ('dasdas','TUR','dasdas','60000')");


                /*degerler kullanıcıdan alıncak ise ;
                String sql ="insert into city (Name,CountryCode,District,Population) VALUES ('denemee','TUR','denemee','60000')";
                st = connection.prepareStatement(sql);
                st.setString(1,"denemee");
                */

            int sonuc = 0;
            sonuc = st.executeUpdate();
            if (sonuc > 0) {
                System.out.println("Kayit Eklendi");
            } else {
                System.out.println("kayit basarisiz !");
            }
        } catch (SQLException e) {
            baglanti.showErrorMessage(e);
        } finally {
            st.close();
            connection.close();
        }
    }


    public static void UpdateQuery() throws SQLException {
        //guncelleme iselmini id üzerinden yapacağız
        DbHelper baglanti = new DbHelper();
        PreparedStatement st = null;

        try {
            connection = baglanti.getConnection();

            //degerler biliniyorsa asagıdaki satır ile ekleme yapılabilir.
            st = connection.prepareStatement("update city set population =80000 where id =2");


                /*degerler kullanıcıdan alıncak ise ;
                String sql ="insert into city (Name,CountryCode,District,Population) values ('?','?','?','?')";
                st = connection.prepareStatement(sql);
                st.setString(1,"denemee");
                st.setString(2,"TUR");
                st.setString(3,"denemee");
                st.setInt(4,60000);*/

            int sonuc = 0;
            sonuc = st.executeUpdate();
            if (sonuc > 0) {
                System.out.println("kayit guncellendi");
            } else {
                System.out.println("kayit GUNCELLENEMEDİ");
            }
        } catch (SQLException e) {
            baglanti.showErrorMessage(e);
        } finally {
            st.close();
            connection.close();
        }

    }

    public static void DeleteQuery() throws SQLException {
        //guncelleme iselmini id üzerinden yapacağız
        DbHelper baglanti = new DbHelper();
        PreparedStatement st = null;

        try {
            connection = baglanti.getConnection();

            //degerler biliniyorsa asagıdaki satır ile ekleme yapılabilir.
            st = connection.prepareStatement("delete from city  where id =1");


                /*degerler kullanıcıdan alıncak ise ;
                String sql ="insert into city (Name,CountryCode,District,Population) values ('?','?','?','?')";
                st = connection.prepareStatement(sql);
                st.setString(1,"denemee");
                st.setString(2,"TUR");
                st.setString(3,"denemee");
                st.setInt(4,60000);*/

            int sonuc = 0;
            sonuc = st.executeUpdate();
            if (sonuc > 0) {
                System.out.println("kayit silindi");
            } else {
                System.out.println("kayit silinemedi");
            }
        } catch (SQLException e) {
            baglanti.showErrorMessage(e);
        } finally {
            st.close();
            connection.close();
        }

    }
}


