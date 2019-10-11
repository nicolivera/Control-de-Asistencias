package sample.Modelo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Controller;

public class VistasController {

    public void mostrarVistaAdministrador() {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/modelo/interfazAdministrador.fxml"));

            Parent root1 = (Parent) fxmlLoader.load();
            //System.out.printf("jsjsjs");
            root1.setVisible(false);
            Stage stage = new Stage();

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.DECORATED);
           // stage.setTitle("ABC");

            //Controller xCon = fxmlLoader.<Controller>getController();
           // xCon.SetUserId(12);
            stage.setScene(new Scene(root1));
            stage.showAndWait();
            root1.setVisible(true);
        }
        catch (Exception E)
        {
            System.out.println(E.getMessage());
        }

    }}


