package Cuenta_banco;

public class Cliente {
    String cedula;
    String nombre;

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    

}
