
public class PersonPlayGround {
	public static void main(String[] args) {
		final Person person = new Person()
				.withName("Jose")
				.withLastName("Maselli")
				.withId(123456);
		System.out.println(person);
	}
}
