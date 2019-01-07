package tanerus.designpattern.structural.facede.everydaydemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {

	public static void main(String[] args) throws IOException {
		//URL uses a Facade Pattern
		URL url = new URL("http", "www.google.com", 80, "/");

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;

		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}

	}

}
