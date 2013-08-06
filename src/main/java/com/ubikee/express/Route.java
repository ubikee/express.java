package com.ubikee.express;

import static com.ubikee.express.Express.HTTPMethod.*;

import com.ubikee.express.Express;
import com.ubikee.express.Express.HTTPMethod;

import java.io.IOException;


public class Route {
		
	public final String path;
	public final HTTPMethod method;
	public final RouteHandler handler;

	public Route(final HTTPMethod method, final String path, final RouteHandler handler) {
		this.path = path;
		this.method = method;
		this.handler = handler;
	}

	public void process(RouteRequest request, RouteResponse response) throws IOException{
		handler.handle(request, response);
	}
}