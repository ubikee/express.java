package com.ubikee.express.http;

import com.google.common.base.Preconditions;
import com.sun.net.httpserver.HttpExchange;
import com.ubikee.express.RouteResponse;

import java.io.IOException;
import java.io.OutputStream;

public class HTTPRouteResponse implements RouteResponse {

    private HttpExchange exchange;

    public HTTPRouteResponse(HttpExchange exchange) {
        Preconditions.checkNotNull(exchange);
        this.exchange = exchange;
    }

    @Override
    public void send(String content) throws IOException {
        this.exchange.sendResponseHeaders(200, content.length());
        OutputStream os = exchange.getResponseBody();
        os.write(content.getBytes());
        os.close();
    }
}
