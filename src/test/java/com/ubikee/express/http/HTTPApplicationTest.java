package com.ubikee.express.http;

import org.junit.Before;
import org.junit.Test;

public class HTTPApplicationTest {

    HTTPApplication application = null;

    @Before
    public void setUp() throws Exception {
        application = new HTTPApplication();
    }

    @Test
    public void testListen() throws Exception {
        application.listen(8001);
    }

}
