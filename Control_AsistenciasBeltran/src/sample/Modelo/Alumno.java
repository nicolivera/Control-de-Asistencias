package sample.Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Alumno {


    /*static int ID_Alumno;
    static String Nombre;
    static String Apellido;
    static String Dni;
    static String LugarNacimiento;
    static String Provincia;
    static String Domicilio;
    static String Localidad;
    static String Telefono;
    static String E_mail;


    public Alumnos() {

    }


    public Alumnos(int id_alumno, String nombre, String apellido, String dni, String lugarnacimiento, String provincia, String domicilio, String localidad, String telefono, String e_mail) {

        this.ID_Alumno = id_alumno;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Dni = dni;
        this.LugarNacimiento = lugarnacimiento;
        this.Provincia = provincia;
        this.Domicilio = domicilio;
        this.Localidad = localidad;
        this.Telefono = telefono;
        this.E_mail = e_mail;


    }


    public void setID_Alumno(int id_alumno) {
        this.ID_Alumno = id_alumno;
    }

    public static int getID_Alumno() {
        return ID_Alumno;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public static String getNombre() {
        return Nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public static String getApellido() {
        return Apellido;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public static String getDni() {
        return Dni;
    }

    public void setLugarNacimiento(String lugarnacimiento) {
        LugarNacimiento = lugarnacimiento;
    }

    public static String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public static String getTelefono() {
        return Telefono;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public static String getLocalidad() {
        return Localidad;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public static String getDomicilio() {
        return Domicilio;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public static String getProvincia() {
        return Provincia;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public static String getE_mail() {
        return E_mail;
    }


    public static void InsertarAlum(Alumnos alumnos) { //metodo insertar alumno
        System.out.println("metodo listar");
        System.out.println("llamo metodo");
        Conectar conect = new Conectar();
        String sql = "INSERT INTO alumnos(nombre,apellido,dni,lugarnacimiento,provincia,domicilio,localidad,telefono,email)VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = (PreparedStatement) conect.getConnection().prepareStatement(sql);
            ps.setInt(1,alumnos.getID_Alumno());
            ps.setString(1, alumnos.getNombre());
            ps.setString(2, alumnos.getApellido());
            ps.setString(3, alumnos.getDni());
            ps.setString(4, alumnos.getLugarNacimiento());
            ps.setString(5, alumnos.getProvincia());
            ps.setString(6, alumnos.getDomicilio());
            ps.setString(7, alumnos.getLocalidad());
            ps.setString(8, alumnos.getTelefono());
            ps.setString(9, alumnos.getE_mail());
            ps.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        } finally {
            try {
                ps.close();
                conect.desconectar();
            } catch (SQLException e) {
            }
        }
    }

    public static List<Alumnos> ListarAlumnos() {

        System.out.println("Grilla ALUMNOS");
        Conectar conect = new Conectar();

        List<Alumnos> ListaAlum = new ArrayList<>();
        String sql = "SELECT  id_alumno,nombre,apellido,dni,lugarnacimiento,provincia,domicilio,localidad,telefono,email FROM alumnos where id_alumno=1" ;
        PreparedStatement ps = null;
        ResultSet rs = null;


        try {
            ps = (PreparedStatement) conect.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();//Devuelve datos
            while (rs.next()) {

                Alumnos Alum = new Alumnos();
                Alum.setID_Alumno(rs.getInt("id_alumno"));
                Alum.setNombre(rs.getString("nombre"));
                Alum.setApellido(rs.getString("apellido"));
                Alum.setDni(rs.getString("dni"));
                Alum.setLugarNacimiento(rs.getString("lugarnacimiento"));
                Alum.setProvincia(rs.getString("provincia"));
                Alum.setDomicilio(rs.getString("domicilio"));
                Alum.setLocalidad(rs.getString("localidad"));
                Alum.setTelefono(rs.getString("telefono"));
                Alum.setE_mail(rs.getString("email"));

                //System.out.println(getID_Alumno());
                ListaAlum.add(Alum);

            }


        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
            // System.out.println("aca1");

        }
        return ListaAlum;

    }*/

}
