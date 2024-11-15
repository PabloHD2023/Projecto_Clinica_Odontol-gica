package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
public class Paciente extends Persona implements Serializable  {
    
    private boolean tieneOs;
    private String tipoSangre;
    
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy = "paciente")
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(boolean tieneOs, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNac);
        this.tieneOs = tieneOs;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    public boolean isTieneOs() {
        return tieneOs;
    }

    public void setTieneOs(boolean tieneOs) {
        this.tieneOs = tieneOs;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    @Override
    public String toString() {
        return "Paciente{" + "tieneOs=" + tieneOs + ", tipoSangre=" + tipoSangre + ", unResponsable=" + unResponsable + ", listaTurnos=" + listaTurnos + '}';
    }
    
}
