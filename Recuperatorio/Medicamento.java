package Recuperatorio;

public class Medicamento {
    String nombre;
    String dosis;


    public Medicamento(){}
    public Medicamento(String nombre, String dosis){
        this.nombre = nombre;
        this.dosis = dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

}
