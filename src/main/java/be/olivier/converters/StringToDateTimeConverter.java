package be.olivier.converters;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;

public class StringToDateTimeConverter implements Converter<String, LocalDateTime> {

	@Override
	public LocalDateTime convert(String string) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss,SSS");
		LocalDateTime dateTime = LocalDateTime.parse(string, formatter);
		return dateTime;
	}

}
