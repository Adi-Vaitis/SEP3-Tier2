package tier2.network.employeeNetwork;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tier2.models.Employee;
import tier2.services.communication.SocketClient;
import tier2.services.utility.NetworkPackage;
import tier2.services.utility.NetworkType;

@Component
public class EmployeeAccountImpl implements EmployeeAccount
{
  @Autowired SocketClient socket;

  @Override public Employee validateEmployee(String username, String password)
  {
    Gson gson = new Gson();
    Employee employee = new Employee();
    employee.setUsername(username);
    employee.setPassword(username);
    String serializedAccount = gson.toJson(employee);
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.LOGINEMPLOYEE, serializedAccount);
    String input = socket.communicate(networkPackage);
    return gson.fromJson(input, Employee.class);
  }

  @Override public void deleteEmployee(int employeeId)
  {
    Gson gson = new Gson();
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.DELETEEMPLOYEE, String.valueOf(employeeId));
    socket.communicate(networkPackage);
  }

  @Override public Employee getEmployeeByUsername(String username)
  {
    Gson gson = new Gson();
    Employee employee = new Employee();
    employee.setUsername(username);

    String serializedEmployee = gson.toJson(employee);
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.GETEMPLOYEEBYUSERNAME, serializedEmployee);
    String input = socket.communicate(networkPackage);

    return gson.fromJson(input, Employee.class);
  }

  @Override public Employee getEmployeeById(int id)
  {
    Gson gson = new Gson();
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.GETEMPLOYEEBYID, String.valueOf(id));
    String input = socket.communicate(networkPackage);
    return gson.fromJson(input, Employee.class);
  }
}
