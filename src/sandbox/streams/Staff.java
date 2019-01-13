package sandbox.streams;

public abstract class Staff {
	
	private String firstName;
	private int id;
	
	public Staff(String firstName, int id) {
		this.firstName = firstName;
		this.id = id;
	}
	
	public abstract double pay();
	
	public abstract String position();
	
	public String getFirstName() {
		return firstName;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String toString() {
		return "Firstname: " + firstName + "\n" +
				"id: " + id + "\n";
	}
}
