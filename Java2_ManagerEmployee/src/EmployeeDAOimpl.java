import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOimpl implements EmployeeDAO {
	ArrayList<Employee> list = null;

	public EmployeeDAOimpl() {

		if (list == null) {
			list = new ArrayList<Employee>();
		}
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		return list;
	}

	@Override
	public void addEmployee(Employee employee) {
		list.add(employee);
	}

	@Override
	public Employee getEmployee(int index) {
		if (index < list.size() && index >= 0) {
			return list.get(index);
		}
		return null;
	}

	@Override
	public void clear() {
		list.clear();
	}
}
