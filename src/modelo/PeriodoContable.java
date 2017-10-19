package modelo;
// Generated 10-15-2017 11:15:46 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PeriodoContable generated by hbm2java
 */
public class PeriodoContable  implements java.io.Serializable {


     private int idPeriodo;
     private EstadoPeriodo estadoPeriodo;
     private int anioPeriodo;
     private Date fechaInicio;
     private Date fechaFin;
     private Set partidas = new HashSet(0);

    public PeriodoContable() {
    }

	
    public PeriodoContable(int idPeriodo, EstadoPeriodo estadoPeriodo, int anioPeriodo, Date fechaInicio, Date fechaFin) {
        this.idPeriodo = idPeriodo;
        this.estadoPeriodo = estadoPeriodo;
        this.anioPeriodo = anioPeriodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public PeriodoContable(int idPeriodo, EstadoPeriodo estadoPeriodo, int anioPeriodo, Date fechaInicio, Date fechaFin, Set partidas) {
       this.idPeriodo = idPeriodo;
       this.estadoPeriodo = estadoPeriodo;
       this.anioPeriodo = anioPeriodo;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.partidas = partidas;
    }
   
    public int getIdPeriodo() {
        return this.idPeriodo;
    }
    
    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }
    public EstadoPeriodo getEstadoPeriodo() {
        return this.estadoPeriodo;
    }
    
    public void setEstadoPeriodo(EstadoPeriodo estadoPeriodo) {
        this.estadoPeriodo = estadoPeriodo;
    }
    public int getAnioPeriodo() {
        return this.anioPeriodo;
    }
    
    public void setAnioPeriodo(int anioPeriodo) {
        this.anioPeriodo = anioPeriodo;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Set getPartidas() {
        return this.partidas;
    }
    
    public void setPartidas(Set partidas) {
        this.partidas = partidas;
    }




}

