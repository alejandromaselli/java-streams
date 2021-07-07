
public class Person {
	private String name;
	private String lastName;
	private int id;

	public Person() {
		this.name = "";
		this.lastName = "";
		this.id = 0;
	}

	public Person(String name, String lastName, int id) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}

	public Person withName(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Person withLastName(String name) {
		this.name = name;
		return this;
	}

	public int getId() {
		return this.id;
	}

	public Person withId(int id) {
		this.id = id;
		return this;
	}

	@Override
	public String toString() {
		return "Person(name=" + getName() + ", lastname=" + getLastName() + " id=" + getId();
	}
}
