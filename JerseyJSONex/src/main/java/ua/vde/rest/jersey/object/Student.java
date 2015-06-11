package ua.vde.rest.jersey.object;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private int age;

	// must have constructor without parameters
	// empty constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer("ID:").append(this.id).append("First Name:")
				.append(this.firstName).append("Last Name:")
				.append(this.lastName).append("Age:").append(this.age)
				.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
