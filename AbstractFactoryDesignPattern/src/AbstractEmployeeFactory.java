
public class AbstractEmployeeFactory {

	public static EmployeeFactory getEmployeeFactory(String type) {
		if(type.trim().equalsIgnoreCase("Android")) {
			return new AndroidDevConcreteFactoryAndroidDev();
		}
	}
}
