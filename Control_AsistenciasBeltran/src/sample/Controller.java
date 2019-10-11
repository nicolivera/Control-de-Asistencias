package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Modelo.conexion;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {


    // VistasController VC = new VistasController();


    @FXML
    public TextField usuario;

    @FXML
    public TextField contrasenia;

    @FXML
    public Button confirma;

  String existencia;


    @FXML
    public void Ingresa(ActionEvent event) throws SQLException {


        do {

            if (usuario.getText().equals("")) {
                MostrarError("El nombre no puede estar vacío");
                usuario.requestFocus();
                return;
            }

            if (usuario.getText().length() < 4) {
                MostrarError("El nombre no puede tener menos de 5 caracteres");
                usuario.requestFocus();
                return;
            }

            if (contrasenia.getText().equals("")) {
                MostrarError("La contraseña no puede estar vacía");
                usuario.requestFocus();
                return;
            }

            if (contrasenia.getText().length() < 3) {
                MostrarError("La contraseña no puede tener menos de 8 caracteres");
                usuario.requestFocus();
                return;
            }

        } while (usuario.getText().equals("") || (usuario.getText().length() < 4) || (contrasenia.getText().equals("")) || (contrasenia.getText().length() < 3));




        conexion con = new conexion();
        String consulta= ("select usuario from Control_Asistencia.usuario where usuario='"+usuario.getText()+"'");

        ResultSet rs = con.consultar(consulta);


        /*while (rs.next()) {
            existencia = rs.getInt("tipo_usuario");
        }*/
        existencia = rs.getString("usuario");




        if ( existencia == usuario.getText() )
        {
            System.out.println("El usuario existe");
        }
        else
        {
            System.out.println("El usuario no existe");
        }










        // VC.mostrarVistaAdministrador();


        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Vista/interfazAdministrador.fxml"));

            Parent root1 = (Parent) fxmlLoader.load();
            //System.out.printf("jsjsjs");
            //root1.setVisible(false);
            Stage stage = new Stage();

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("ABC");

            //Controller xCon = fxmlLoader.<Controller>getController();
            // xCon.SetUserId(12);
            stage.setScene(new Scene(root1));
            stage.showAndWait();
            // root1.setVisible(true);
        }
        catch (Exception E)
        {
            System.out.println(E.getMessage());
        }

    }


    private void MostrarError(String pMensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error al grabar");
        alert.setHeaderText(null);
        alert.setContentText(pMensaje);
        alert.showAndWait();
    }

}



