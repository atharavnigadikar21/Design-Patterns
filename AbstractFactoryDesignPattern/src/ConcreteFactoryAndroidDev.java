
public class ConcreteFactoryAndroidDev implements EmployeeFactory {

	@Override
	public Employee createEmployee() {
		return new AndroidDev();
	}

}

