package tier2.services.employee;

import org.springframework.stereotype.Service;
import tier2.models.Employee;
import tier2.network.employeeNetwork.EmployeeAccount;

@Service
public class EmployeeService implements IEmployeeService
{
  private EmployeeAccount employeeAccount;

  public EmployeeService(EmployeeAccount employeeAccount){
    this.employeeAccount = employeeAccount;
  }

  @Override public Employee GetEmployee(String username, String password)
  {
    return employeeAccount.GetEmployee(username, password);
  }

  @Override public void DeleteEmployee(int employeeId)
  {
    employeeAccount.DeleteEmployee(employeeId);
  }

  @Override public Employee GetEmployeeByUsername(String username)
  {
    return employeeAccount.GetEmployeeByUsername(username);
  }

  @Override public Employee GetEmployeeById(int employeeId)
  {
    return employeeAccount.GetEmployeeById(employeeId);
  }
}
