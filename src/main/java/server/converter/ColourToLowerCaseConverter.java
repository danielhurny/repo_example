package server.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import server.Colour;

@Converter
public class ColourToLowerCaseConverter implements AttributeConverter<Colour, String> {

	@Override
	public String convertToDatabaseColumn(Colour colour) {
		return colour.toString();
	}

	@Override
	public Colour convertToEntityAttribute(String data) {
		// TODO Auto-generated method stub
		return Colour.valueOf(data.toUpperCase());
	}

}
