
public class ConcreteWebDebFactory implements EmployeeFactory {

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDev();
	}

}
