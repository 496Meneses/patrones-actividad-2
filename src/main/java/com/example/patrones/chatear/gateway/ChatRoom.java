package com.example.patrones.chatear.gateway;

import com.example.patrones.chatear.Usuario;

public interface ChatRoom {
    void send(String mensaje, Usuario emisor);
    void addUser(Usuario usuario);
}
