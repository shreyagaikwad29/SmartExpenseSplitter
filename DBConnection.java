package com.expense.util;

import  java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final  String URL = "jdbc:mysql://localhost:3306/expense_splitter";
    private static final  String USER = "root";
    private static final  String PASS = "Qwerty@1";

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL,USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
