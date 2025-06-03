package Recuperatorio;

import Entities.Turno;

import java.util.List;

public class Agenda {
    Veterinario veterinario;
    List<Turno> turnos;

    public Agenda(){}
    public Agenda(Veterinario veterinario, List<Turno> turnos){
        this.veterinario = veterinario;
        this.turnos = turnos;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}

