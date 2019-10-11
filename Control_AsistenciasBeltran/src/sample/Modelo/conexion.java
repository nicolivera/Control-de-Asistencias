package sample.Modelo;

import javafx.scene.control.Alert;

import java.sql.*;

public class conexion {
    //configuro el connection string
    static String conndata = ("jdbc:mysql://localhost:3306/Control_Asistencia?user=root&password=155515804322&Control_Asistencia&serverTimezone=UTC");
    static Connection connection=null;

    public void guardar(String stringsql) {
        try {
            Connection conn = DriverManager.getConnection(conndata);
            Statement statement = conn.createStatement();
            statement.execute(stringsql);
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    /*public void borrar(String stringsql) {
        try {
            Connection conn = DriverManager.getConnection(conndata);
            Statement statement = conn.createStatement();
            statement.execute(stringsql);
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }
    }*/

    public ResultSet consultar(String stringsql) {
        ResultSet rs;
        try {
            Connection conn = DriverManager.getConnection(conndata);
            Statement statement = conn.createStatement();

            rs = statement.executeQuery(stringsql);
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
            rs = null;
        }
        return rs;

    }

}