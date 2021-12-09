package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee
{
  @JsonProperty
  private String Username;
  @JsonProperty
  private String Password;

  public Employee(){}

  public String getUsername()
  {
    return Username;
  }

  public String getPassword()
  {
    return Password;
  }

  public void setUsername(String Username)
  {
    this.Username = Username;
  }

  public void setPassword(String Password)
  {
    this.Password = Password;
  }

  @Override public String toString()
  {
    return "Employee{" + "username='" + Username + '\'' + ", password='"
        + Password + '\'' + '}';
  }
}
