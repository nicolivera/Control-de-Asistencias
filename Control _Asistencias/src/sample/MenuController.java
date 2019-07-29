package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;


public class MenuController {

    ObservableList<String> Carreras = FXCollections.observableArrayList("Analista de Sistemas", "Seguridad e Higiene", "Diseño Industrial");
    ObservableList<String> Sistemas = FXCollections.observableArrayList("Programación II", "Bases de datos", "Sistemas Operativos", "Sistemas de Información I", "Ingles II", "Analisis Matematico II", "Edi II", "Probabilidad y Estadisticas");
    ObservableList<String> Comisiones = FXCollections.observableArrayList("1ro 1ra", "1ro 2da", "2do 1ra", "2do 2da", "3ro 1ra", "3ro 2da");

    @FXML
    public ComboBox carrera;

    @FXML
    public ComboBox asignatura;

    @FXML
    public CheckBox chkAcepto;

    @FXML
    public Button btnCargar;

    @FXML
    public ComboBox comision;



    @FXML
    public void initialize() {
        carrera.setValue("Adrogué");
        carrera.setItems(Carreras);
        asignatura.setValue("Programación II");
        asignatura.setItems(Sistemas);
        comision.setValue("1ro 1ra");
        comision.setItems(Comisiones);
    }

    //Mensajes mens= new Mensajes();
    MostrarVistas m = new MostrarVistas();

    @FXML
    public void Cargar(MouseEvent Event) { //muestra ventana con carga de datos para alumnos

        if
            (chkAcepto.isSelected()){
            MostrarInfo("Dato grabado con éxito");
            m.mostrarGuardar();
        }else{
            MostrarError("No se puede grabar el pedido si no se ha cerrado");
        }







    }



    private void MostrarError(String pMensaje){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error al grabar");
        alert.setHeaderText(null);
        alert.setContentText(pMensaje);
        alert.showAndWait();
    }


    private void MostrarInfo(String pMensaje){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Infomración al grabar");
        alert.setHeaderText(null);
        alert.setContentText(pMensaje);
        alert.showAndWait();
    }

}
