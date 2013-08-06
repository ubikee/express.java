package com.ubikee.express.http;

import com.google.common.base.Preconditions;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.ubikee.express.Application;
import com.ubikee.express.Express;

import java.io.IOException;
import java.net.InetSocketAddress;

public class HTTPApplication extends Application implements HttpHandler {

	private HttpServer server;

	public void listen(int port) {

        Preconditions.checkNotNull(port);

		try {
			server = HttpServer.create(new InetSocketAddress(port), 0);
			HttpContext ctx = server.createContext ("/" , this);
            server.setExecutor(null);
            server.start();
		} catch (IOException e) {
            //TODO
			e.printStackTrace();
		}
	}

	@Override
	public void handle(HttpExchange exchange) throws IOException {

        Express.HTTPMethod method = Express.HTTPMethod.valueOf(exchange.getRequestMethod());
        HTTPRouteRequest request = new HTTPRouteRequest(exchange);
        HTTPRouteResponse response = new HTTPRouteResponse(exchange);

        process(method, request, response);
	}
}
