package tier2.network.employeeNetwork;

import tier2.models.Employee;

public interface EmployeeAccount
{
  Employee validateEmployee(String username, String password);

  void deleteEmployee(int employeeId);

  Employee getEmployeeByUsername(String usernmae);

  Employee getEmployeeById(int id);
}
