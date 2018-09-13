package be.olivier;

import java.io.File;

import be.olivier.restclients.LogFileClient;

public class Main {

	public static void main(String[] args) throws Exception{
		
		File file = new File("C:\\Users\\cursist\\Desktop\\DNTest\\DNTest\\src\\main\\resources\\server.log");
		LogFileClient client = new LogFileClient();
		System.out.println(client.readRenderings(file));
	}

}
