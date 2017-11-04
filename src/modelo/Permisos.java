package modelo;
// Generated 11-03-2017 09:45:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Permisos generated by hbm2java
 */
public class Permisos  implements java.io.Serializable {


     private int idPermiso;
     private boolean verCatalogo;
     private boolean ingresarPartida;
     private boolean editarPartida;
     private boolean agregarCuenta;
     private boolean editarCuenta;
     private boolean adminUsuarios;
     private Set roleses = new HashSet(0);

    public Permisos() {
    }

	
    public Permisos(int idPermiso, boolean verCatalogo, boolean ingresarPartida, boolean editarPartida, boolean agregarCuenta, boolean editarCuenta, boolean adminUsuarios) {
        this.idPermiso = idPermiso;
        this.verCatalogo = verCatalogo;
        this.ingresarPartida = ingresarPartida;
        this.editarPartida = editarPartida;
        this.agregarCuenta = agregarCuenta;
        this.editarCuenta = editarCuenta;
        this.adminUsuarios = adminUsuarios;
    }
    public Permisos(int idPermiso, boolean verCatalogo, boolean ingresarPartida, boolean editarPartida, boolean agregarCuenta, boolean editarCuenta, boolean adminUsuarios, Set roleses) {
       this.idPermiso = idPermiso;
       this.verCatalogo = verCatalogo;
       this.ingresarPartida = ingresarPartida;
       this.editarPartida = editarPartida;
       this.agregarCuenta = agregarCuenta;
       this.editarCuenta = editarCuenta;
       this.adminUsuarios = adminUsuarios;
       this.roleses = roleses;
    }
   
    public int getIdPermiso() {
        return this.idPermiso;
    }
    
    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }
    public boolean isVerCatalogo() {
        return this.verCatalogo;
    }
    
    public void setVerCatalogo(boolean verCatalogo) {
        this.verCatalogo = verCatalogo;
    }
    public boolean isIngresarPartida() {
        return this.ingresarPartida;
    }
    
    public void setIngresarPartida(boolean ingresarPartida) {
        this.ingresarPartida = ingresarPartida;
    }
    public boolean isEditarPartida() {
        return this.editarPartida;
    }
    
    public void setEditarPartida(boolean editarPartida) {
        this.editarPartida = editarPartida;
    }
    public boolean isAgregarCuenta() {
        return this.agregarCuenta;
    }
    
    public void setAgregarCuenta(boolean agregarCuenta) {
        this.agregarCuenta = agregarCuenta;
    }
    public boolean isEditarCuenta() {
        return this.editarCuenta;
    }
    
    public void setEditarCuenta(boolean editarCuenta) {
        this.editarCuenta = editarCuenta;
    }
    public boolean isAdminUsuarios() {
        return this.adminUsuarios;
    }
    
    public void setAdminUsuarios(boolean adminUsuarios) {
        this.adminUsuarios = adminUsuarios;
    }
    public Set getRoleses() {
        return this.roleses;
    }
    
    public void setRoleses(Set roleses) {
        this.roleses = roleses;
    }




}


