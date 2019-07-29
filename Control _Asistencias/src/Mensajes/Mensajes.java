package Mensajes;

import javafx.scene.control.Alert;

public class Mensajes {
    public void registroExitoso(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("registro");
        alert.setHeaderText(null);
        alert.setContentText("Su registro a sido exitoso!");
        alert.showAndWait();
    }



    public void contrasenia(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("contraseña");
        alert.setHeaderText(null);
        alert.setContentText("las contraseñas ingresadas no coinciden!");
        alert.showAndWait();
    }

    public void camposVacios(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("campos");
        alert.setHeaderText(null);
        alert.setContentText("hay espacios vacios!");
        alert.showAndWait();
    }

    public void caracteres(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("contraseña");
        alert.setHeaderText(null);
        alert.setContentText("las contraseñas no cumple con la cantidad minima de caracteres!");
        alert.showAndWait();
    }

    public void usuario(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("usuario");
        alert.setHeaderText(null);
        alert.setContentText("ya hay otro usuario con ese nombre");
        alert.showAndWait();
    }

    public void registroInvalido(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("registro");
        alert.setHeaderText(null);
        alert.setContentText("Error al guardar!");
        alert.showAndWait();
    }

    public void datosIncorrectos(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("inicio sesion");
        alert.setHeaderText(null);
        alert.setContentText("datos incorrectos!");
        alert.showAndWait();
    }

    public void mail(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("mail");
        alert.setHeaderText(null);
        alert.setContentText("Formato mail incorrecto!");
        alert.showAndWait();
    }



}


