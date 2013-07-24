package com.ubikee.express;

import static com.ubikee.express.Express.HTTPMethod.DELETE;
import static com.ubikee.express.Express.HTTPMethod.GET;
import static com.ubikee.express.Express.HTTPMethod.POST;
import static com.ubikee.express.Express.HTTPMethod.PUT;

import com.ubikee.express.Express.HTTPMethod;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Application implements HttpHandler {

	private HttpServer server;
	
	public Routes routes = new Routes();

	public Application() {
	}

	public void get(String path, RouteHandler handler) {
		routes.add(GET, path, handler);
	}

	public void post(String path, RouteHandler handler) {
		routes.add(POST, path, handler);
	}

	public void put(String path, RouteHandler handler) {
		routes.add(PUT, path, handler);
	}

	public void delete(String path, RouteHandler handler) {
		routes.add(DELETE, path, handler);
	}

	public void process(HTTPMethod method, RouteRequest request) {
		Route route = routes.get(method, request.path);
		route.process(request);
	}

	public void listen(int port) {
		try {
			server = HttpServer.create(new InetSocketAddress(port), 0);
			HttpContext ctx = server.createContext ("/" , this);
		} catch (IOException e) {
			//TODO
		}
	}

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		// TODO Auto-generated method stub
	}
}
