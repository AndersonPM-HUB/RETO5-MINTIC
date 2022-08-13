package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import model.vo.Proyecto;
import util.Conexion;

public class ProyectoDao {

    public List<Proyecto> listarProyetos() throws SQLException {

        var lista = new ArrayList<Proyecto>();
        Connection conn = Conexion.getConnection();
        try {
            var consulta = "select ID_Proyecto , Constructora , Numero_Habitaciones , Ciudad from Proyecto where Clasificacion = 'Casa Campestre' AND "
                    + "Ciudad in ('Barranquilla', 'Santa Marta', 'Cartagena')";
            Statement st = conn.createStatement();
            ResultSet rta = st.executeQuery(consulta);
            while (rta.next()) {

                Proyecto p = new Proyecto();
                p.setIdProyecto(rta.getInt("ID_Proyecto"));
                p.setContructora(rta.getString("Constructora"));
                p.setnHabitaciones(rta.getInt("Numero_Habitaciones"));
                p.setCiudad(rta.getString("Ciudad"));

                lista.add(p);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public List<Proyecto> generarNuevoInforme(String cl, String c) throws SQLException {
        var lista = new ArrayList<Proyecto>();
        Connection conn = Conexion.getConnection();
        try {
            var consulta = String.format("select ID_Proyecto , Constructora , Numero_Habitaciones , Ciudad from Proyecto where Clasificacion = '%s' AND "
                    + "Ciudad in ('%s')", cl, c);
            Statement st = conn.createStatement();
            ResultSet rta = st.executeQuery(consulta);
            while (rta.next()) {

                Proyecto p = new Proyecto();
                p.setIdProyecto(rta.getInt("ID_Proyecto"));
                p.setContructora(rta.getString("Constructora"));
                p.setnHabitaciones(rta.getInt("Numero_Habitaciones"));
                p.setCiudad(rta.getString("Ciudad"));

                lista.add(p);

            }
        }
           catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
}