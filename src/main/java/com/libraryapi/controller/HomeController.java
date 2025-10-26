package com.libraryapi.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class HomeController implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        switch (httpExchange.getRequestMethod()){
            case "GET" -> processGet(httpExchange);
            case "POST" -> processPost(httpExchange);
            default: processDefault(httpExchange);
        }
    }

    private void processGet(HttpExchange httpExchange){}

    private void processPost(HttpExchange httpExchange){}

    private void processDefault(HttpExchange httpExchange){}

}
