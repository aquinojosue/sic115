package modelo;
// Generated 10-15-2017 11:15:46 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoPeriodo generated by hbm2java
 */
public class EstadoPeriodo  implements java.io.Serializable {


     private int idEstado;
     private String nombreEstado;
     private Set periodoContables = new HashSet(0);

    public EstadoPeriodo() {
    }

	
    public EstadoPeriodo(int idEstado, String nombreEstado) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
    }
    public EstadoPeriodo(int idEstado, String nombreEstado, Set periodoContables) {
       this.idEstado = idEstado;
       this.nombreEstado = nombreEstado;
       this.periodoContables = periodoContables;
    }
   
    public int getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    public String getNombreEstado() {
        return this.nombreEstado;
    }
    
    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    public Set getPeriodoContables() {
        return this.periodoContables;
    }
    
    public void setPeriodoContables(Set periodoContables) {
        this.periodoContables = periodoContables;
    }




}

