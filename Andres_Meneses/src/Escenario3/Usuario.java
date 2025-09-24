package Escenario3;

public class Usuario {
    private String username;
    private ChatMediator chatMediator;

    public Usuario(ChatMediator chatMediator, String username) {
        this.chatMediator = chatMediator;
        this.username = username;
    }

    public void enviarMensaje(String mensaje) {
        System.out.println(username + ": " + mensaje);
        chatMediator.enviarMensaje(mensaje, this);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println(username + " recibe " + mensaje);
    }

    public String getUsername() {
        return username;
    }
}
