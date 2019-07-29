package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MostrarVistas {
    public void mostrarMenu(){

        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Menu.fxml"));//trae la ventana del menu
            Parent root= (Parent) fxmlLoader.load();
            Stage stage= new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e)
        {e.printStackTrace();
            System.out.println(e);
        }
    }

    public void mostrarGuardar(){

        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Guardar.fxml"));//trae la ventana del menu
            Parent root= (Parent) fxmlLoader.load();
            Stage stage= new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e)
        {e.printStackTrace();
            System.out.println(e);
        }
    }

}
