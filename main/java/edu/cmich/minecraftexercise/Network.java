package edu.cmich.minecraftexercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import edu.cmich.minecraftexercise.util.Log;

public class Network {
	private static final String LINK = "http://www.peachmonkey.net/tester.php";

	public static int lookUp(String playerName) {
		int value = 0;

		try {
			String line;
			URL url = new URL(LINK + "?name=" + playerName);
			URLConnection con = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			value = Integer.parseInt(reader.readLine());
		} catch (MalformedURLException e) {
			e.printStackTrace();
			value = -1;
		} catch (IOException e) {
			e.printStackTrace();
			value = -1;
		} catch (NumberFormatException e) {
			Log.error("Invalid data on server");
			value = -1;
		}

		return value;
	}
}
