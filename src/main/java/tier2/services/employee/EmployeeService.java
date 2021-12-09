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

  @Override public Employee validateEmployee(String Username, String password)
  {
    return employeeAccount.validateEmployee(Username, password);
  }

  @Override public void deleteEmployee(int employeeId)
  {
    employeeAccount.deleteEmployee(employeeId);
  }

  @Override public Employee getEmployeeByUsername(String Username)
  {
    return employeeAccount.getEmployeeByUsername(Username);
  }

  @Override public Employee getEmployeeById(int id)
  {
    return employeeAccount.getEmployeeById(id);
  }
}
