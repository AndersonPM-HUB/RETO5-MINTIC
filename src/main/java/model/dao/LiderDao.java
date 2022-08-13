package model.dao;

//consulta 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.vo.Lider;
import util.Conexion;

public class LiderDao {

    //crear un metodo para conexion con la bd 
    public List<Lider> listadoLideres() throws SQLException {

        ArrayList<Lider> listado = new ArrayList<>();

        //conectarme atraves de la clase conexion a la bd
        Connection conn = Conexion.getConnection();

        String consulta = "select ID_Lider , Nombre ,Primer_Apellido ,Ciudad_Residencia "
                + " from Lider  order by Ciudad_Residencia;";

        try {
            Statement st = conn.createStatement();
            ResultSet rta = st.executeQuery(consulta);

            while (rta.next()) {

                Lider l = new Lider();
                l.setIdLider(rta.getInt("ID_Lider"));
                l.setNombre(rta.getString("Nombre"));
                l.setApellido(rta.getString("Primer_Apellido"));
                l.setCiudad(rta.getString("Ciudad_Residencia"));

                listado.add(l);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listado;
    }

    public Lider datosLider(int cc) throws SQLException {
        Lider l = null;
        Connection conn = Conexion.getConnection();
        try {
            var consulta = String.format("select * from Lider where Id_Lider ='%d' ", cc);
            Statement st = conn.createStatement();
            ResultSet rta = st.executeQuery(consulta);

            while (rta.next()) {
                l = new Lider(); 
                l.setIdLider(rta.getInt("ID_Lider"));
                l.setNombre(rta.getString("Nombre"));
                l.setApellido(rta.getString("Primer_Apellido"));
                l.setApellido2(rta.getString("Segundo_Apellido"));
                l.setSalario(rta.getInt("Salario"));
                l.setCiudad(rta.getString("Ciudad_Residencia"));
                l.setCargo(rta.getString("Cargo"));
                l.setClasificacion(rta.getInt("Clasificacion"));
                l.setDocumento(rta.getString("Documento_Identidad"));
                l.setFecha(rta.getString("Fecha_Nacimiento"));
            }
            return l;

        } catch (Exception e) {
            return l;
        }
        
    }
}
