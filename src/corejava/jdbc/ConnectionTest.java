package corejava.jdbc;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectionTest {
    /**
     * In java we have to follow these four steps to write a program for database
     * 1] Include db jar
     * 2] Import SQL package and its classes
     * 3] Setup driver(Optional)
     * 4] Setup connection
     * 5] Create statement
     * 6] Execute statement
     * 7] Close connection
     */
    //Store Connection string to a variable  jdbc:sqlite:C:\SQLite3\db
    String db_string = "jdbc:sqlite:c:\\SQLite3\\db\\chinook.db";
    Connection con;
    Statement st;
    ResultSet rs;
    int playlist_id;
    String playlist_name;

    void setupConnection() throws SQLException{
        //Create connection
        System.out.println("Setting up connection...!!!");
        con = DriverManager.getConnection(db_string);
    }

    void fetchDataFromDB() throws SQLException{
        System.out.println("Fetching rows from DB");
        st = con.createStatement();
        String select_qry = "Select * from playlists";
        rs = st.executeQuery(select_qry);
        while(rs.next()){
            playlist_id = rs.getInt("PlaylistId");
            playlist_name = rs.getString("Name");
            System.out.println(playlist_id+"        |       "+playlist_name);
        }
        con.close();
        System.out.println("Closed connection!!!");
    }
    void insertIntoDB() throws SQLException{
        System.out.println("Connected to SQLite Database!");
        st = con.createStatement();
        System.out.println("Forming Query!");
        String ins_qry = "insert into playlists values(25,'QA Tests')";
        System.out.println("Executing Query!");
        try{
            st.executeQuery(ins_qry);
        }catch(Exception ex){
            System.out.println("Exception occured "+ex.getMessage());
        }
        //st.executeQuery("insert into <table> values(value1,value2,...,valuen)"); //also valid
        //con.close(); //Close the connection
    }

}
