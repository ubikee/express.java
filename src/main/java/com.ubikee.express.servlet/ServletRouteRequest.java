package com.ubikee.express.servlet;

import com.google.common.base.Preconditions;
import com.ubikee.express.RouteRequest;

import javax.servlet.http.HttpServletRequest;

public class ServletRouteRequest implements RouteRequest {

    private HttpServletRequest request;

    public ServletRouteRequest(HttpServletRequest request) {
        Preconditions.checkNotNull(request);
        this.request = request;
    }

    @Override
    public String path() {
        return request.getPathInfo();
    }

    @Override
    public String param(String name) {
        return request.getParameter(name);
    }

}
