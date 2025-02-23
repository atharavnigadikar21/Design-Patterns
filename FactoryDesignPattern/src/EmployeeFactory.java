
public class EmployeeFactory {
		
		public static Employee getEmployee(String str) {
			
			if(str.trim().equalsIgnoreCase("android dev")) {
				return new AndroidDev();
			}else if(str.trim().equalsIgnoreCase("WebDev")) {
				return new WebDev();
			}
				return null;

		}
}
