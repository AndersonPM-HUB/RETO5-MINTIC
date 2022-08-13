
package model.vo;


public class Proyecto {

    private int idProyecto;
    private int nHabitaciones;  
    private String contructora;
    private String ciudad;

   

    
    /**
     * @return the idProyecto
     */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * @param idProyecto the idProyecto to set
     */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * @return the nHabitaciones
     */
    public int getnHabitaciones() {
        return nHabitaciones;
    }

    /**
     * @param nHabitaciones the nHabitaciones to set
     */
    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    /**
     * @return the contructora
     */
    public String getContructora() {
        return contructora;
    }

    /**
     * @param contructora the contructora to set
     */
    public void setContructora(String contructora) {
        this.contructora = contructora;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proyecto{");
        sb.append("idProyecto=").append(idProyecto);
        sb.append(", nHabitaciones=").append(nHabitaciones);
        sb.append(", contructora=").append(contructora);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
