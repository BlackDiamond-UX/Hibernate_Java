package com.gestion.gestionBancaire.DBconn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 public class GetConnection {
     private static String user = "postgres";
     private static String password = "admin";
     private static String url = "jdbc:postgresql://localhost:5432/GestionBancaire";

     public static Connection connect() throws SQLException {
         try {
             Class.forName("org.postgresql.Driver");
         } catch (ClassNotFoundException e) {
             System.out.println("connection its okey ");
             return null;
         }

        //try {
             return DriverManager.getConnection(url, user, password);
         //} catch (SQLException throwables) {

            // return null;
         //}
     }

 }




