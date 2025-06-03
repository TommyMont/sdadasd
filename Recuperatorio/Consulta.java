package Recuperatorio;

import java.util.Date;

public class Consulta {
    Date fecha;
    String diagnostico;
    Tratamiento tratamiento;
    Veterinario veterinario;

    public Consulta(){}
    public Consulta(Date fecha, String diagnostico, Tratamiento tratamiento, Veterinario veterinario){
        this.diagnostico = diagnostico;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.veterinario = veterinario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
}
