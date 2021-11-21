    package com.company;

    import java.sql.*;
    import java.util.ArrayList;

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
                rs = st.executeQuery("SELECT * from country");

                ArrayList<Country> ulkeler = new ArrayList<Country>();


                while(rs.next())
                {
                    ulkeler.add(new Country(
                            rs.getString("code"),
                            rs.getString("name"),
                            rs.getString("continent"),
                            rs.getString("region")));
                }
                System.out.println("------Arraylist Boyutu------");
                System.out.println(ulkeler.size());

            }
            catch (SQLException e) {
                baglanti.showErrorMessage(e);
            }
            finally {
                connection.close();
            }
        }
    }
