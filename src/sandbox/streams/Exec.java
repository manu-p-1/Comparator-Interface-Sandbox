package sandbox.streams;

import java.text.NumberFormat;
import java.util.Locale;

public class Exec extends Staff{
	
	private String position;
	private double salary;
	private double travel;
	
	public Exec(String firstname, int id, String position, double salary) {
	
		super(firstname, id);
		this.position = position;
		this.salary = salary;
		travel = 0;
	}

	@Override
	public double pay() {
		return salary;
	}

	@Override
	public String position() {
		return position;
	}
	
	public void travelReimbursement(double travel) {
		this.travel = travel;
	}
	
	public String toString() {
		Locale locale = new Locale("en", "US");
		return super.toString() + "Position: " + position + "\n" +
								  "Salary: $" + NumberFormat.getInstance(locale).format(salary) + "\n" +
								  "Travel Reimbursment: $" + NumberFormat.getInstance(locale).format(travel) + "\n";
	}
}
