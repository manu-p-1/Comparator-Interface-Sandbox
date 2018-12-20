package sandbox.streams;


public class Employee {
	
	private String name;
	private Integer id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "Name: " + name + "\n" +
				"Id: " + id;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}
}
