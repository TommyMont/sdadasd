package Recuperatorio;

import java.util.List;

public class FichaMedica {
    Animal animal;
    List<Consulta> consultas;
    List<HistorialPeso> historialPeso;
    List<Vacuna> vacunas;

    public FichaMedica(){}
    public FichaMedica(Animal animal, List<Consulta> consultas, List<HistorialPeso> historialPeso, List<Vacuna> vacunas){
        this.animal = animal;
        this.consultas = consultas;
        this.historialPeso = historialPeso;
        this.vacunas = vacunas;
    }

    public Animal getAnimal() {
        return animal;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<HistorialPeso> getHistorialPeso() {
        return historialPeso;
    }

    public List<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void setHistorialPeso(List<HistorialPeso> historialPeso) {
        this.historialPeso = historialPeso;
    }

    public void setVacunas(List<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

}
