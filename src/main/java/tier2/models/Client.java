package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Client
{
  @JsonProperty
  private int Id;
  @JsonProperty
  private String Username;
  @JsonProperty
  private String Password;
  @JsonProperty
  private String Email;
  @JsonProperty
  private String Name;

  public Client()
  {
  }

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

  @Override public String toString() {
    return "id=" + Id + ", name='" + Name + '\'' + ", username='" + Username + '\'' + ", password='" + Password
        + '\'';
  }
}
