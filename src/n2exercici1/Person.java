package n2exercici1;


// appends the annotation with the path where the json file will be written
@ConvertToJSON(file_path = "resources\\person.json")
public class Person {
	private String name;
	private String surname;
	private String dni;
	
	public Person() {}
	
	public Person(String name, String surname, String dni) {
		super();
		this.name = name;
		this.surname = surname;
		this.dni = dni;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nom=");
		builder.append(name);
		builder.append(", cognoms=");
		builder.append(surname);
		builder.append(", dni=");
		builder.append(dni);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
