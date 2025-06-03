package Recuperatorio;

import java.util.Date;

public class HistorialPeso {
    Date fecha;
    double peso;


    public HistorialPeso(){}
    public HistorialPeso(Date fecha, double peso){
        this.peso = peso;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
