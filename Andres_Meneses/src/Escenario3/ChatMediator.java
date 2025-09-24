package Escenario3;

public interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);
    void agregarUsuarioAChat(Usuario usuario);
}
