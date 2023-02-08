package corejava.jdbc;

import java.sql.*;

public class Recordsets {
    public static void main(String[] args) throws SQLException {
        //Store Connection string to a variable
        String db_string = "jdbc:sqlite:c:\\SQLite3\\db\\chinook.db";

        //Create connection
        Connection con = DriverManager.getConnection(db_string);
        System.out.println("Connected to SQLite Database!");
        Statement st = con.createStatement();
        String qry = "select AlbumId,Title, ArtistId from albums";
        System.out.println();
        ResultSet sr = st.executeQuery(qry);  //Use only for Select statement
        //st.executeQuery("insert into <table> values(value1,value2,...,valuen)"); //also valid
        while(sr.next()){
            int albumid = sr.getInt("AlbumId");
            String alnmae = sr.getString("Title");
            int artid = sr.getInt("ArtistId");
            System.out.println(albumid+"        |       "+artid+"       |       "+alnmae);
        }
        con.close(); //Close the connection*/
        ConnectionTest ct = new ConnectionTest();
        ct.setupConnection();
        //ct.insertIntoDB();
        ct.fetchDataFromDB();
    }
}
