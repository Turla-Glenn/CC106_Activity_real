package com.example.activity_cc106_real;


import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class ConnectionClass {

    protected static String DB = "cha";

    protected static String IP = "192.168.1.18";

    protected static String PORT = "3306";

    protected static String USER = "cha";

    protected static String PASS = "123456789";

    public Connection CONN() {
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectiongString = "jdbc:mysql://"+IP+":"+PORT+"/"+DB;
            conn = DriverManager.getConnection(connectiongString,USER,PASS);
        }catch (Exception e) {
            Log.e("ERROR", Objects.requireNonNull(e.getMessage()));
        }
        return conn;
    }
}
