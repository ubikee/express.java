package com.ubikee.express;

public interface RouteRequest {

	String path();

    String param(String name);
}