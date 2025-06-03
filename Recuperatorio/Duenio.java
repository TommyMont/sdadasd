package Recuperatorio;

public class Duenio {
    String nombre;
    String direccion;
    String telefono;

    public Duenio(){}
    public Duenio(String nombre, String direcion, String telefono){
        this.nombre = nombre;
        this.direccion = direcion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
