package kz.project.web.db;

import java.sql.*;

public class Db {
    Connection conn;
    public String getText() throws SQLException {
        Db app = new Db();
        String out;
        app.connectionToDerby();
        out = app.normalDbUsage();
        return out;
    }

    public void connectionToDerby() throws SQLException {
        // -------------------------------------------
        // URL format is
        // jdbc:derby:<local directory to save data>
        // -------------------------------------------
        String url = System.getProperty("user.dir").replaceAll("/", "\\\\"+"\\\\").substring(2);
        String dbUrl = "jdbc:derby:" + url + ";create=true";
        conn = DriverManager.getConnection(dbUrl);
    }

    public String normalDbUsage() throws SQLException {
        Statement stmt = conn.createStatement();


        try {
            stmt.executeUpdate("Drop Table outputtext");
        }
        catch (SQLSyntaxErrorException ex){

        }
        finally{

            stmt.executeUpdate("Create table outputtext (id int primary key, name varchar(30))");


            stmt.executeUpdate("insert into outputtext values (1,'Hello World !!!')");
            stmt.executeUpdate("insert into outputtext values (2,'Greet Go')");


            ResultSet rs = stmt.executeQuery("SELECT * FROM outputtext WHERE id = 2");
            rs.next();
            String output = rs.getString("name");

            return output;

        }

    }

}
