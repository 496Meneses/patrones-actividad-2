package com.example.patrones.chatear;

import com.example.patrones.chatear.gateway.ChatRoom;

public class Main {
    public static void main(String[] args) {
        ChatRoom chat = new ConcreteChatRoom();

        Usuario ana = new Usuario("Ana", chat);
        Usuario juan = new Usuario("Juan", chat);
        Usuario maria = new Usuario("Maria", chat);

        chat.addUser(ana);
        chat.addUser(juan);
        chat.addUser(maria);

        chat.send("Hola a todos!", ana);
        chat.send("Hola Ana", juan);
        chat.send("Hola Ana", maria);
        chat.send("Como estan ?", ana);
    }
}