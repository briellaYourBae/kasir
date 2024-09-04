/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package toko;


    import java.sql.*;

    public class Config {
        public static Connection mysqlconfig;

        public static Connection configDB() throws SQLException {
            try {
                String url = "jdbc:mysql://localhost:3306/kasir";
                String user = "root";
                String pass = "";   
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlconfig = DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                System.out.println(e);
            }
            return mysqlconfig;
        }
    } 
