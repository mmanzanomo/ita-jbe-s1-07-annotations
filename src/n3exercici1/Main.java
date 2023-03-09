package n3exercici1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import n2exercici1.ConvertToJSON;
import n2exercici1.Person;

public class Main {

	public static void main(String[] args) {				
		Person p = new Person("Marco", "Polo", "1213A");
		
		// Take the class annotation
		Class<?> aClass = p.getClass();
		String file_path = aClass.getAnnotation(ConvertToJSON.class).file_path();
		
		String toJSON = SerializeToJSON.serializeToJSON(p);
		write( file_path, toJSON );

	}
	
	public static void write(String directory, String json) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(directory, false))) {
			bw.write(json);
			System.out.println("File writed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
