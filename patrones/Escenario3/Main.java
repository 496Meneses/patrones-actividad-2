package Escenario3;

public class Main {
    public static void main(String[] args) {
        ChatMediator chat = new ConcreteChatMediator();

        Usuario goku = new Usuario(chat, "Goku");
        Usuario vegeta = new Usuario(chat, "Vegeta");
        Usuario krilin = new Usuario(chat, "Krilin");

        chat.agregarUsuarioAChat(goku);
        chat.agregarUsuarioAChat(vegeta);
        chat.agregarUsuarioAChat(krilin);

        goku.enviarMensaje("¡Hola soy goku!");
        vegeta.enviarMensaje("Savandija!");
        goku.abandonarChat();
        krilin.enviarMensaje("Hola!");
    }
}