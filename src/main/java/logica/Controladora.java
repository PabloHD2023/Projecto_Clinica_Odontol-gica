package logica;

import persistencia.ControladoraPersistencia;

/**
 *
 * @author pablo
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(String nombreUsuario, String contrasenia, String rolUsuario) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRolUsuario(rolUsuario);
        
        controlPersis.crearUsuario(usu);
    }
    
}
