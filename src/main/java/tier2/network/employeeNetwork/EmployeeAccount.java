package tier2.network.employeeNetwork;

import tier2.models.Employee;

public interface EmployeeAccount
{
  Employee GetEmployee(String username, String password);

  void DeleteEmployee(int employeeId);

  Employee GetEmployeeByUsername(String username);

  Employee GetEmployeeById(int employeeId);
}
