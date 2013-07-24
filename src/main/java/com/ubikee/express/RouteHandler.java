package com.ubikee.express;

import com.ubikee.express.RouteRequest;
import com.ubikee.express.RouteResponse;

interface RouteHandler {
	
	public void handle(RouteRequest request, RouteResponse response);

}