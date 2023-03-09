package n3exercici1;

import java.lang.reflect.Field;


public class SerializeToJSON {
	public static <T> String serializeToJSON(T object) {
		T o = object;
		StringBuilder sb = new StringBuilder();
		
		Class<?> aClass = o.getClass();
		Field[] fields = aClass.getDeclaredFields();	
		
		sb.append("{");
		for (int i = 0; i < fields.length; i++) {
			sb.append("\"").append(fields[i].getName()).append("\":\"").append(fields[i]).append("\",");
		}
		sb.append("}");
		
		return sb.toString();
	}
}
