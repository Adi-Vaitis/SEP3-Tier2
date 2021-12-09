package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee
{
  @JsonProperty
  private String username;
  @JsonProperty
  private String password;

  public Employee(){}

  public String getUsername()
  {
    return username;
  }

  public String getPassword()
  {
    return password;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  @Override public String toString()
  {
    return "Employee{" + "username='" + username + '\'' + ", password='"
        + password + '\'' + '}';
  }
}
