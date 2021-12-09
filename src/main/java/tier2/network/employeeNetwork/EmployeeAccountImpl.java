package tier2.network.employeeNetwork;

import org.springframework.stereotype.Component;
import tier2.models.Employee;

@Component
public class EmployeeAccountImpl implements EmployeeAccount
{
  @Override public Employee validateEmployee(String username, String password)
  {
    return null;
  }

  @Override public void deleteEmployee(int employeeId)
  {

  }

  @Override public Employee getEmployeeByUsername(String usernmae)
  {
    return null;
  }

  @Override public Employee getEmployeeById(int id)
  {
    return null;
  }
}
