package sandbox.streams;

import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
	
		//Dont ask me how I derived these salaries :)
		Staff[] staffArray = {
				new Employee("Jim", 52113, "Salesman", 50000),
				new Employee("Pam", 52114, "Salesman", 40000),
				new Employee("Dwight", 52115, "Salesman/Assistant (to the) Regional Manager", 70000),
				///
				new Employee("Stanley", 52116, "Salesman", 50000),
				new Employee("Phyllis", 52117, "Salesman", 50000),
				new Employee("Andy", 52118, "Salesman", 50000),
				///
				new Employee("Kevin", 52119, "Accountant", 40000),
				new Employee("Oscar", 52120, "Accountant", 40000),
				new Employee("Angela", 52121, "Accountant", 40000),
				///
				new Employee("Creed", 52122, "Quality Assurance Manager", 30000000),
				new Employee("Meredith", 52123, "Supplier Relations Representative", 30000),
				new Employee("Kelly", 52124, "Customer Service Representative", 30000),
				///
				new Employee("Toby", 52125, "Human Resources Representative", 60000),
				///
				new Employee("Erin", 52126, "Receptionist", 20000),
				///
				new Employee("Michael", 52127, "Regional Manager", 80000),
				///
				new Exec("David", 70000, "CFO", 500000)
		};		
		
		Staff[] eeSort = ArrayUtil.sort(staffArray, (o1,o2) -> o1.getId().compareTo(o2.getId()));
		Arrays.stream(eeSort).forEach(e -> {
			System.out.println(e);
			System.out.println();
		});
	}
}
