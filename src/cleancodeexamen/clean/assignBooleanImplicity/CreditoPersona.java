package cleancodeexamen.clean.assignBooleanImplicity;

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

    public Integer RegistrarCreditoEfectivo() throws Exception {
        Integer personaId = null;
        String tipoDoc = "DNI";
        Integer edadMinimaCreditoEfectivo = 18;
        Integer cuotasMinimaEfectivo = 12;
        List<String> listaTipoDoc =Arrays.asList( "DNI", "CE", "Passport");
        List<String> listaTipoCreditos =Arrays.asList( "Efectivo", "Hipotecario", "Mancomunado");
        this.esAprobado = (listaTipoDoc.contains(tipoDoc) && 
                                    this.edad >= edadMinimaCreditoEfectivo && 
                                    listaTipoCreditos.contains("Efectivo") && 
                                    this.cuotas < cuotasMinimaEfectivo) && (this.monto >=0 && this.monto <= 1000);
      
        if(esAprobado){
            // guardar persona;
            personaId = 1;    
        }
        
        return personaId;
    }
    
    public boolean analizarMonto(double monto){
        if(monto >=0 && monto <= 1000){
            return true;
        }
        return false;
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
