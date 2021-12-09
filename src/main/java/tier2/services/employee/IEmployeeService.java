package tier2.services.employee;

import tier2.models.Employee;

public interface IEmployeeService
{
  Employee validateEmployee(String Username, String password);

  void deleteEmployee(int employeeId);

  Employee getEmployeeByUsername(String Username);

  Employee getEmployeeById(int id);
}
