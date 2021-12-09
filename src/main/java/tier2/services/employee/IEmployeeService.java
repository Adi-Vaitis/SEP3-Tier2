package tier2.services.employee;

import tier2.models.Employee;

public interface IEmployeeService
{
  Employee GetEmployee(String username, String password);

  void DeleteEmployee(int employeeId);

  Employee GetEmployeeByUsername(String username);

  Employee GetEmployeeById(int employeeId);
}
