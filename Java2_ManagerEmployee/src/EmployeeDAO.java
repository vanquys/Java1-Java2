import java.util.ArrayList;

public interface EmployeeDAO{
	public ArrayList<Employee> getAllEmployee();
	 public void addEmployee(Employee employee);
	 Employee getEmployee(int index);
	 public void clear() ;
}
