package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Modelo.conexion;

import java.sql.ResultSet;
import java.sql.SQLException;

public class interfazAdministrador {
    @FXML
    public TextField nombre;

    @FXML
    public TextField apellido;

    @FXML
    public TextField usuario;

    @FXML
    public TextField contraseña;

    @FXML
    public Button guardar;

    @FXML
    public ComboBox tipousuario;

    @FXML
    public ComboBox carrera;

    @FXML
    public ComboBox comision;

    int tipo_usuario;

    int Carrera;

    int id;




    ObservableList<String> usuarios = FXCollections.observableArrayList("administrador","profesor","alumno");
    ObservableList<String> carreras = FXCollections.observableArrayList("Analista de sistemas","Diseño Industrial","Seguridad e Higiene");
    ObservableList<String> comisiones = FXCollections.observableArrayList("2do 1ra","2do 2da");

    @FXML
    public void initialize(){
        tipousuario.setItems(usuarios);
        tipousuario.setValue("administrador");
        carrera.setItems(carreras);
        carrera.setValue("Analista de sistemas");
        comision.setItems(comisiones);
        comision.setValue("2do 1ra");
    }


    @FXML
    public void Guardar (ActionEvent event)throws SQLException {
        do{

            if (nombre.getText().equals("")) {
                error("El nombre no puede estar vacío");
                nombre.requestFocus();
                return;
            }

            if (nombre.getText().length() < 5) {
                error("El nombre no puede tener menos de 5 caracteres");
                nombre.requestFocus();
                return;
            }

            if (apellido.getText().equals("")) {
                error("El apellido no puede estar vacío");
                apellido.requestFocus();
                return;
            }

            if (apellido.getText().length() < 5) {
                error("El apellido no puede tener menos de 5 caracteres");
                apellido.requestFocus();
                return;
            }
            if (usuario.getText().equals("")) {
                error("El usuario no puede estar vacío");
                usuario.requestFocus();
                return;
            }

            if (usuario.getText().length() < 5) {
                error("El usuario no puede tener menos de 5 caracteres");
                usuario.requestFocus();
                return;
            }

            if (contraseña.getText().equals("")) {
                error("La contraseña no puede estar vacía");
                contraseña.requestFocus();
                return;
            }

            if (contraseña.getText().length() < 3) {
                error("La contraseña no puede tener menos de 8 caracteres");
                contraseña.requestFocus();
                return;
            }


            String opcion = (String) tipousuario.getSelectionModel().getSelectedItem();

            if(opcion.equals("administrador")){
                tipo_usuario=1;
            }
            if(opcion.equals("alumno")){
                tipo_usuario=2;
            }
            if(opcion.equals("profesor")){
                tipo_usuario=3;
            }


            String opcion2 = (String) carrera.getSelectionModel().getSelectedItem();

            if(opcion2.equals("Analista de sistemas")){
                Carrera=1;
            }
            if(opcion2.equals("Diseño industrial")){
                Carrera=2;
            }
            if(opcion2.equals("Seguridad e Higiene")){
                Carrera=3;
            }

            String opcion3 = (String) comision.getSelectionModel().getSelectedItem();

            if(opcion3.equals("2do 1ra")){
                Carrera=1;
            }
            if(opcion3.equals("2do 2da")){
                Carrera=2;
            }

           /* String numCadena = "1";

            int numEntero = Integer.parseInt(numCadena);*/




        } while (nombre.getText().equals("") || (nombre.getText().length() < 5) || (apellido.getText().equals("")) || (apellido.getText().length() < 5) || (usuario.getText().equals("")) || (usuario.getText().length() < 5) || (contraseña.getText().equals("")) || (contraseña.getText().length() < 5));


        String opcion = (String) tipousuario.getSelectionModel().getSelectedItem();

        if(opcion.equals("administrador")){
            tipo_usuario=1;
        }
        if(opcion.equals("alumno")){
            tipo_usuario=2;
            String guardar1= "insert into Control_Asistencia.usuario (nombre, apellido, usuario, contrasenia, tipo_usuario, carrera, comision) values ('"+nombre.getText()+"','"+apellido.getText()+"','"+usuario.getText()+"','"+contraseña.getText()+"','"+tipo_usuario+"', '"+carrera+"', '"+comision+"');";
            System.out.println(guardar1);
            conexion c = new conexion();
            c.guardar(guardar1);


        }




    }
   /* @FXML
    public void Borrar (ActionEvent event)throws SQLException {
        conexion c = new conexion();
        String consulta = "select id from usuario where usuario='"+usuario.getText()+"';";
        ResultSet rs = c.consultar(consulta);
        String borrar = "delete from usuario, alumno where usuario.id='"+rs+"' and '"+rs+"'=alumno.usuario;"
        ;
        System.out.println(borrar);

        c.borrar(borrar);

    }

    private final ObservableList<Model.Usuarios> data =
            FXCollections.observableArrayList(
                    new Model.Usuarios("Jacob", "Smith", "jacob.smith@example.com"),
                    new Model.Usuarios("Isabella", "Johnson", "isabella.johnson@example.com"),
                    new Model.Usuarios("Ethan", "Williams", "ethan.williams@example.com"),
                    new Model.Usuarios("Emma", "Jones", "emma.jones@example.com"),
                    new Model.Usuarios("Michael", "Brown", "michael.brown@example.com")
            );


    @FXML
    public void initialize(){



        cargaListaUsuarios();


    }*/





    private void error(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error al grabar");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}

