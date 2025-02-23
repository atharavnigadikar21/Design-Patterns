
public class DeveloperClient {
	
	public static void main(String [] args) {
		
		Employee emp = EmployeeFactory.getEmployee("android dev");
		int sal = emp.salery();
		
		System.out.println(sal);
		
		Employee emp2 = EmployeeFactory.getEmployee("WebDev");
		int sal2 = emp2.salery();
		
		System.out.println(sal2);
	}
}
