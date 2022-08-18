package db;
import java.sql.*;
import javax.swing.JOptionPane;


public class MySQL{
  
    private static Connection Con;
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/isunah_prog2","root","Izzy.2128");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de conexión");
            JOptionPane.showMessageDialog(null,"Error de conexión: " + e.getMessage());
        }
        return Con;
    }
}
