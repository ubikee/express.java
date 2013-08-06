package com.ubikee.express;

import com.ubikee.express.RouteRequest;
import com.ubikee.express.RouteResponse;

import java.io.IOException;

public interface RouteHandler {
	
	public void handle(RouteRequest request, RouteResponse response) throws IOException;

}