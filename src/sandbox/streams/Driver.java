package sandbox.streams;
import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
		Employee[] ee = {
				new Employee("Manu", 1),
				new Employee("Jim", 5),
				new Employee("Michael", 61),
				new Employee("Kevin", 22),
				new Employee("Pam", 34),
				new Employee("Toby", 69),
				new Employee("Oscar", 52)};
		
		Employee[] eeSort = ArrayUtil.sort(ee, (o1,o2) -> o1.getId().compareTo(o2.getId()));
		Arrays.stream(eeSort).forEach(e -> {
			System.out.println(e);
			System.out.println("");
		});
	}	
}
