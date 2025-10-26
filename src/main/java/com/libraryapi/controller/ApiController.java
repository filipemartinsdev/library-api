package com.libraryapi.controller;

import com.libraryapi.controller.v1.HomeControllerV1;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class ApiController implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) {
        switch (httpExchange.getRequestMethod()) {
            case "GET" -> processGet(httpExchange);
            case "POST" -> processPost(httpExchange);
            default -> processDefault(httpExchange);
        }
    }

    private void processGet(HttpExchange httpExchange){
        String path = httpExchange.getRequestURI().getPath();
        if (path.startsWith("/v1")){
            HomeControllerV1.process(httpExchange);
        }
        else {
            processDefault(httpExchange);
        }
    }

//    TODO: IMPLEMENT THIS
    private void processPost(HttpExchange httpExchange){
        try {
            httpExchange.sendResponseHeaders(400, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            httpExchange.close();
        }
    }

    private void processDefault(HttpExchange httpExchange) {
        try {
            httpExchange.sendResponseHeaders(400, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            httpExchange.close();
        }
    }
}
