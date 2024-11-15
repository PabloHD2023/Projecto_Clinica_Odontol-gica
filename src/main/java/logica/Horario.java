package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Horario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorario;
    private String horarioInicio;
    private String horarioFin;

    public Horario() {
    }

    public Horario(int idHorario, String horarioInicio, String horarioFin) {
        this.idHorario = idHorario;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }

    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", horarioInicio=" + horarioInicio + ", horarioFin=" + horarioFin + '}';
    }
    
}
