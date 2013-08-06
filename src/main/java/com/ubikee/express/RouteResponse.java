package com.ubikee.express;

import java.io.IOException;

public interface RouteResponse {

	void send(String content) throws IOException;

}