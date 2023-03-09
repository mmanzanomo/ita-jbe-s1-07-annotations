package n3exercici1;

import java.lang.reflect.Field;


public class SerializeToJSON {
	/*
	 * This method receives an object and serializes all its attributes to JSON.
	 * */
	public static <T> String serializeToJSON(T object) {
		T o = object;
		String field_name;
		Field field;
		StringBuilder sb = new StringBuilder();
		String value;
		
		Class<?> aClass = o.getClass();
		Field[] fields = aClass.getDeclaredFields();	
		
		sb.append("{");
		for (int i = 0; i < fields.length; i++) {
			try {
				field_name = fields[i].getName();				// It gets the name of the attribute
				field = aClass.getDeclaredField(field_name);    // It gets the field with specific name
				field.setAccessible(true);    					// Makes non-public fields accessible to read their value
				value = (String) field.get(o); 					// Reads the value of the field
				if (i < fields.length - 1) {
					sb.append("\"").append(field_name).append("\":\"").append(value).append("\",");
				} else {  			// if the field is the last attribute it does not add a comma
					sb.append("\"").append(field_name).append("\":\"").append(value).append("\"");
				}
				field.setAccessible(false);					    // make the field inaccessible again
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		sb.append("}");
		
		return sb.toString();
	}
}
