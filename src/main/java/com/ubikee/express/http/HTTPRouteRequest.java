package com.ubikee.express.http;

import com.google.common.base.Preconditions;
import com.sun.net.httpserver.HttpExchange;
import com.ubikee.express.RouteRequest;

public class HTTPRouteRequest implements RouteRequest {

    private HttpExchange exchange;

    public HTTPRouteRequest(HttpExchange exchange) {
        Preconditions.checkNotNull(exchange);
        this.exchange = exchange;
    }

    @Override
    public String path() {
        return exchange.getRequestURI().getPath();
    }

    @Override
    public String param(String name) {
        return null;
    }
}
