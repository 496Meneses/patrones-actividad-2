package com.example.patrones.chatear;

import com.example.patrones.chatear.gateway.ChatRoom;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {

    private String nombre;
    private ChatRoom chatRoom;

    public void enviar(String mensaje) {
        System.out.println(nombre + " envia: " + mensaje);
    }

    public void recibir(String mensaje, String emisor) {
        System.out.println(nombre + " recibe de " + emisor + ": " + mensaje);
    }
}