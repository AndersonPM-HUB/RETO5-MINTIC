package controller;

import java.sql.SQLException;
import java.util.List;
import model.dao.*;
import model.vo.Compra;
import model.vo.Lider;
import model.vo.Proyecto;

public class InformesController {

    private LiderDao liders;
    private ProyectoDao proyects;
    private ComprasDao buys;

    public InformesController() {
        liders = new LiderDao();
        proyects = new ProyectoDao();
        buys = new ComprasDao();
    }

    //crear metodos para listar lo del modelodao
    public List<Lider> listadoLiders() throws SQLException {
        var lista = liders.listadoLideres();
        return lista;
    }

    public List<Proyecto> listadoProyects() throws SQLException {
        var lista = proyects.listarProyetos();
        return lista;
    }

    public List<Compra> listadobuys() throws SQLException {
        var lista = buys.listarCompras();
        return lista;
    }

    public Lider infoLider(int cc) throws SQLException {
        Lider l = null;
        l = liders.datosLider(cc);
        return l;
    }

    public List<Proyecto> generarinforme2(String clasificacion, String ciudad) throws SQLException {
        var lista = proyects.generarNuevoInforme(clasificacion, ciudad);
        return lista;
    }
    
    public List<Compra> generarinforme3(String proveedor, String ciudad) throws SQLException {
        var lista = buys.generarNuevoInforme(proveedor, ciudad);
        return lista;
    }
}
