package com.libraryapi;

import com.libraryapi.controller.ApiController;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpContext;

import java.io.IOException;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) {
        final String PORT = System.getenv("PORT");
        HttpServer server = null;

        try {
            server = HttpServer.create(
                    new InetSocketAddress("0.0.0.0", Integer.parseInt(PORT)),
                    0

            );
            HttpContext homeController = server.createContext("/", new ApiController());
            server.start();
            System.out.println("[OK] Server ON");
        }
        catch (IOException e) {
            System.out.println("[DANGER][ERROR] Server OFFLINE");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
