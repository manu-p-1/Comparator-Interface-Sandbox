package sandbox.streams;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee extends Staff {

	private String position;
	private double salary;

	public Employee(String firstname, int id, String position, double salary) {
		super(firstname, id);
		this.position = position;
		this.salary = salary;
	}

	@Override
	public double pay() {
		return salary;
	}

	@Override
	public String position() {
		return position;
	}

	public String toString() {
		Locale locale = new Locale("en", "US");
		return super.toString() + "Position: " + position + "\n" +
								  "Salary: $" + NumberFormat.getInstance(locale).format(salary) + "\n";
	}
}
