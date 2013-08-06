package com.ubikee.express.http;

public class HTTPTest {

    public static void main(String[] args) throws Exception {

        HTTPApplication app = new HTTPApplication();

        app.get("/hello", (req, res) -> res.send("HELLO EVA"));
        app.get("/hello/([^/]*)$", (req, res) -> res.send("HELLO EVA"));
        app.get("/hello/(.*)/address", (req, res) -> res.send("HELLO EVA"));

        app.listen(8080);
    }

}