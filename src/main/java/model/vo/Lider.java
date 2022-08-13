
package model.vo;


public class Lider {

    private String nombre; 
    private String apellido; 
    private int  salario;
    private String ciudad, cargo, documento, fecha;
    private int idLider, clasificacion ;
    private String apellido2; 
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

 

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the idLider
     */
    public int getIdLider() {
        return idLider;
    }

    /**
     * @param idLider the idLider to set
     */
    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lider:\n");
        sb.append(",\n nombre=").append(nombre);
        sb.append(",\n apellido=").append(apellido);
        sb.append(",\n  salario=").append(salario);
        sb.append(",\n  ciudad=").append(ciudad);
        sb.append(",\n  cargo=").append(cargo);
        sb.append(",\n  documento=").append(documento);
        sb.append(",\n  fecha=").append(fecha);
        sb.append(",\n  idLider=").append(idLider);
        sb.append(",\n  clasificacion=").append(clasificacion);
        sb.append(",\n  apellido2=").append(apellido2);
        sb.append('}');
        return sb.toString();
    }

    
   
    
    
}
