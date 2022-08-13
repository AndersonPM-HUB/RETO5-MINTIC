package model.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import model.vo.Compra;
import util.Conexion;

public class ComprasDao {

    public List<Compra> listarCompras() throws SQLException {

        var lista = new ArrayList<Compra>();
        Connection conn = Conexion.getConnection();
        
        var consulta = "select ID_Compra , p.Constructora ,p.Banco_Vinculado\n"
                    + "from Compra \n"
                    + "join Proyecto p\n"
                    + "on compra.ID_Proyecto = p.ID_Proyecto \n"
                    + "where compra.Proveedor ='Homecenter' and p.Ciudad = 'Salento'; ";
        try {
          
            Statement st = conn.createStatement(); 
            ResultSet rta = st.executeQuery(consulta);
                    
            while(rta.next()){
            
                Compra c = new Compra(); 
                
                c.setIdCompra(rta.getInt("ID_Compra")); 
                c.setConstructora(rta.getString("Constructora")); 
                c.setBanco(rta.getString("Banco_Vinculado")); 
                
                lista.add(c);
            
            }
            
        } catch (Exception e) {
            System.out.println(e); 
        }
        return lista; 
    }
    
     public List<Compra> generarNuevoInforme(String p, String city) throws SQLException {

        var lista = new ArrayList<Compra>();
        Connection conn = Conexion.getConnection();
        
        var consulta = String.format("select ID_Compra , p.Constructora ,p.Banco_Vinculado\n"
                    + "from Compra \n"
                    + "join Proyecto p\n"
                    + "on compra.ID_Proyecto = p.ID_Proyecto \n"
                    + "where compra.Proveedor ='%s' and p.Ciudad = '%s'; ",p,city );
        try {
          
            Statement st = conn.createStatement(); 
            ResultSet rta = st.executeQuery(consulta);
                    
            while(rta.next()){
            
                Compra c = new Compra(); 
                
                c.setIdCompra(rta.getInt("ID_Compra")); 
                c.setConstructora(rta.getString("Constructora")); 
                c.setBanco(rta.getString("Banco_Vinculado")); 
                
                lista.add(c);
            
            }
            
        } catch (Exception e) {
            System.out.println(e); 
        }
        return lista; 
    }
}
