package be.olivier.restclients;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.olivier.converters.StringToDateTimeConverter;
import be.olivier.entities.Rendering;

public class LogFileClient {
	
	StringToDateTimeConverter converter = new StringToDateTimeConverter();

	public List<Rendering> readRenderings(File file){
		try(Scanner scanner = new Scanner(file)){

			List<Rendering> renderings = new ArrayList<>();
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				//findStartRenderings
				if(line.contains("Executing request startRendering")) {
					LocalDateTime lineDateTime = converter.convert(line.substring(0, 23));					
				}
			}
			return renderings;	
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
