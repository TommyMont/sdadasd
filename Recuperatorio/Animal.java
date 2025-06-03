package Recuperatorio;

public abstract class Animal {
    String nombre;
    int edad;
    EstadoAnimal estado;
    FichaMedica fichaMedica;
    Duenio duenio;

    public Animal(){}
    public Animal(String nombre, int edad, EstadoAnimal estado, FichaMedica fichaMedica, Duenio duenio){
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fichaMedica = fichaMedica;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public FichaMedica getFichaMedica() {
        return fichaMedica;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public void setFichaMedica(FichaMedica fichaMedica) {
        this.fichaMedica = fichaMedica;
    }
}
