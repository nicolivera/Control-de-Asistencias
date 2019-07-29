package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {

    MostrarVistas men = new MostrarVistas();//creo objeto

    @FXML
    public TextField usuario;

    @FXML
    public TextField contrasenia;


    @FXML
    public void Ingresa(MouseEvent arg0) {


        men.mostrarMenu(); //que avanze a la siguiente pag


        if (usuario.getText().equals("")) {
            MostrarError("El nombre no puede estar vacío");
            usuario.requestFocus();
            return;
        }

        if (usuario.getText().length() < 5) {
            MostrarError("El nombre no puede tener menos de 5 caracteres");
            usuario.requestFocus();
            return;
        }

        if (contrasenia.getText().equals("")) {
            MostrarError("La contraseña no puede estar vacía");
            usuario.requestFocus();
            return;
        }

        if (contrasenia.getText().length() < 5) {
            MostrarError("La contraseña no puede tener menos de 8 caracteres");
            usuario.requestFocus();
            return;
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



