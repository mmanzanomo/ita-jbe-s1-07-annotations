package n2exercici1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String toJSON;
		
		Person p = new Person("Marco", "Polo", "1213A");
		
		// Take the class annotation
		Class<?> aClass = p.getClass();
		String path = aClass.getAnnotation(ConvertToJSON.class).file_path();

		// transform info to JSON
		toJSON = convertToJSON(p);
		// write to file
		write( path, toJSON );
	}
	
	public static void write(String directory, String json) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(directory, false))) {
			bw.write(json);
			System.out.println("File writed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String convertToJSON(Person person) {
		String toJSON = "{\"name\" : \"" + person.getName() + "\","
				+ "\"surname\" : " + person.getSurname() + "\","
				+ "\"dni\" : " + person.getDni() + "\""
				+ "}";
		return toJSON;
	}
	
	
	

}
