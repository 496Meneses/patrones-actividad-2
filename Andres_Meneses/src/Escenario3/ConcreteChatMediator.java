package Escenario3;

import java.util.ArrayList;
import java.util.List;


public class ConcreteChatMediator implements ChatMediator {

    private List<Usuario> usuarios;

    public ConcreteChatMediator() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuarioEmisor) {
        usuarios.forEach(usuario -> {
            if (!usuario.getUsername().equalsIgnoreCase(usuarioEmisor.getUsername())) {
                usuario.recibirMensaje(mensaje);
            }
        });
    }

    public void agregarUsuarioAChat(Usuario usuario) {
        if (!usuarios.contains(usuario)) {
            this.usuarios.add(usuario);
        }
    }
}
