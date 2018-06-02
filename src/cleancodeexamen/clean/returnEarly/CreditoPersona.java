package cleancodeexamen.clean.returnEarly;

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
        esAprobado = false;
        if(this.edad < 18){
            return false;
        }
        if(this.cuotas > 50){
            return false;
        }
        if(this.tipoCredito.equals("Efectivo")){
            return false;
        }
        
        return esAprobado = true;
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
