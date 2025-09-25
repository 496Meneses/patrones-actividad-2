package com.example.patrones.chatear;

import com.example.patrones.chatear.gateway.ChatRoom;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatRoom implements ChatRoom {

    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void send(String mensaje, Usuario emisor) {
        emisor.enviar(mensaje);
        for (Usuario usuario : usuarios) {
            if (usuario != emisor) {
                usuario.recibir(mensaje, emisor.getNombre());
            }
        }
    }

    @Override
    public void addUser(Usuario usuario) {
        usuarios.add(usuario);
    }
}
