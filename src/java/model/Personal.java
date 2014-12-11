package model;
// Generated 10/12/2014 10:58:11 AM by Hibernate Tools 3.6.0



/**
 * Personal generated by hbm2java
 */
public class Personal  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String direccion;
     private String sexo;
     private String codigoPostal;

    public Personal() {
    }

    public Personal(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String sexo, String codigoPostal) {
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.direccion = direccion;
       this.sexo = sexo;
       this.codigoPostal = codigoPostal;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }




}

