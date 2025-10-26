package com.libraryapi;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) {
        final String PORT = System.getenv("PORT");
        HttpServer server = null;

        try {
            server = HttpServer.create(
                    new InetSocketAddress("0.0.0.0", Integer.parseInt(PORT)), 0
            );
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        finally {
            if (server!=null){
                server.start();
                System.out.println("[OK] Server ON");
            }
        }
    }
}
