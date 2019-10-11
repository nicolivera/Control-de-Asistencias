package sample.Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Profesor {
  /*  int id_profesor;
    String nombre;
    String apellido;
    String dni;
    String localidad;
    String telefono;
    String email;

    public Profesores() {

    }

    public Profesores(int id_profesor,String nombre,String apellido,String dni,String localidad,String telefono,String email){

        this.id_profesor=id_profesor;
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.localidad=localidad;
        this.telefono=telefono;
        this.email=email;
    }


    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public int getId_profesor() {
        return id_profesor;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static void InsertarProfe(Profesores profesores){

        Conectar conect=new Conectar();
        String sql = "INSERT INTO profesores(nombre,apellido,dni,localidad,telefono,email)VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = (PreparedStatement) conect.getConnection().prepareStatement(sql);
            ps.setInt(1,profesores.getId_profesor());
            ps.setString(1,profesores.getNombre());
            ps.setString(2,profesores.getApellido());
            ps.setString(3, profesores.getDni());
            ps.setString(4,profesores.getLocalidad());
            ps.setString(5,profesores.getEmail());
            ps.setString(6, profesores.getTelefono());
            ps.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        } finally {
            try {
                ps.close();
                conect.desconectar();
            } catch (SQLException e){
            }
        }
    }
    public static List<Profesores> ListarProfesores() {

        System.out.println("Grilla Profesores");
        Conectar conect = new Conectar();

        List<Profesores> ListaProfesores = new ArrayList<>();
        String sql = "SELECT  id_profesor,nombre,apellido,dni,telefono,email FROM profesores" ;
        PreparedStatement ps = null;
        ResultSet rs = null;


        try {
            ps = (PreparedStatement) conect.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();//Devuelve datos
            while (rs.next()) {

                Profesores Profe = new Profesores();
                Profe.setId_profesor(rs.getInt("id_profesor"));
                Profe.setNombre(rs.getString("nombre"));
                Profe.setApellido(rs.getString("apellido"));
                Profe.setDni(rs.getString("dni"));
                Profe.setTelefono(rs.getString("telefono"));
                Profe.setEmail(rs.getString("email"));


                ListaProfesores.add(Profe);

            }


        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
            // System.out.println("aca1");

        }
        return ListaProfesores;

    }
*/

    /*public static void ModificarProfe(Profesores profesores){

        Conectar conect=new Conectar();
        String sql = "UPDATE profesores(nombre,apellido,dni,telefono,email)WHERE(?,?,?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = (PreparedStatement) conect.getConnection().prepareStatement(sql);
            // ps.setInt(1,alumnos.getID_Alumno());
            ps.setString(1,profesores.getNombre());
            ps.setString(2,profesores.getApellido());
            ps.setString(3, profesores.getDni());
            ps.setString(4, profesores.getTelefono());
            ps.setString(5,profesores.getEmail());
            ps.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        } finally {
            try {
                ps.close();
                conect.desconectar();
            } catch (SQLException e){
            }
        }
    }*/

}
