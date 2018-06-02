package cleancodeexamen.dirty.returnEarly;

import java.util.Arrays;
import java.util.List;

public class CreditoPersona {
    Long id;
    String nombre;
    String apellidos;
    String dni;
    Integer edad;
    String direccion;
    String correo;
    String tipoCredito;
    Double monto;
    Integer cuotas;
    boolean esAprobado;

    public boolean analizaAprobacionCredito(double monto) throws Exception {
        Integer personaId = null;
        String tipoDoc = "DNI";
        esAprobado = false;
        List<String> listaTipoDoc =Arrays.asList( "DNI", "CE", "Passport");
        List<String> listaTipoCreditos =Arrays.asList( "Efectivo", "Hipotecario", "Mancomunado");
        
       if(this.edad < 18){
           if(this.cuotas > 50){
               if(this.tipoCredito.equals("Efectivo")){
                   if(this.monto > 50000){
                        esAprobado = true;
                   }
               }
           }
       }
        return esAprobado;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
