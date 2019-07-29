package Conexion;

/*import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
    static String bd="control";
    static String login="root";
    static  String password="155515804322";
    static String url="jdbc:mysql://localhost/"+bd;

    Connection connection=null;

    public void conexionExitosa(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("conexion");
        alert.setHeaderText(null);
        alert.setContentText("Su conexion a sido exitosa!");
        alert.showAndWait();
    }

    public conectar(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            try {
                connection= DriverManager.getConnection(url,login, password);
                if(connection!=null){
                    System.out.println("conexion exitosa");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection(){


        return connection;
    }

    public void desconectar(){

        try{

            connection.close();
        } catch (SQLException e) {

        }
    }

}*/
