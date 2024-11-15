package persistencia;

import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author pablo
 */
public class ControladoraPersistencia {
    
    Controladora control = new Controladora();
    
    UsuarioJpaController usuJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
        
    }
    
}
