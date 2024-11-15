package logica;

import jakarta.persistence.Entity;
import java.util.Date;


@Entity
public class Responsable extends Persona {
    
    private String tipoResp;

    public Responsable() {
    }

    public Responsable(String tipoResp, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNac);
        this.tipoResp = tipoResp;
    }

    public String getTipoResp() {
        return tipoResp;
    }

    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }

    @Override
    public String toString() {
        return "Responsable{" + "tipoResp=" + tipoResp + '}';
    }
    
}
