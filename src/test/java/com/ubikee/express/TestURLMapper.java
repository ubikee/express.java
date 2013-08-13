package com.ubikee.express;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class TestURLMapper {

    @Test
	public void test () {
		
		String path    = "/user/john/basket/1";

        String template = "/user/{user}/basket/{basket}";

        String pattern = "[{]([^/]*)[}]";

        Pattern p = Pattern.compile(pattern);
        String templatePattern = p.matcher(template).replaceAll("(.*)");

        System.out.print(templatePattern);

	}
	

}