package tier2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tier2.models.Employee;
import tier2.services.employee.IEmployeeService;

@RestController
public class EmployeeController
{
  @Autowired IEmployeeService service;

  @GetMapping("/login")
  public Employee getEmployee(@RequestBody Employee employee){
    return service.validateEmployee(employee.getUsername(), employee.getPassword());
  }

  @DeleteMapping("/delete/{employeeId}")
  public void deleteEmployee(@PathVariable int employeeId){
    service.deleteEmployee(employeeId);
  }

  @GetMapping("/accounts")
  public Employee getEmployeeByUsername(@RequestParam("Username") String username){
    return service.getEmployeeByUsername(username);
  }

  @GetMapping("/accounts/{employeeId}")
  public Employee getEmployeeById(@PathVariable int employeeId){
    return service.getEmployeeById(employeeId);
  }
}
