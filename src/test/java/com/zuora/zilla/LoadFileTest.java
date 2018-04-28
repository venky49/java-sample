package com.zuora.zilla;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class LoadFileTest {

	@Test
	public void simpleFileLoad() throws IOException {
		InputStream is = getClass().getClassLoader().getResourceAsStream("toto.txt");
		byte[] b = new byte[is.available()];
		is.read(b);
		String text = new String(b);
		System.out.println(text);
	}

}
