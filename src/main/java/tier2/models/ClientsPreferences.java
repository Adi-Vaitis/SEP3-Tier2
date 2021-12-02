package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientsPreferences
{
  @JsonProperty
  private int clientId;
  @JsonProperty
  private int preferenceId;

  public ClientsPreferences(){}

  public void setClientId(int clientId)
  {
    this.clientId = clientId;
  }

  public void setPreferenceId(int preferenceId)
  {
    this.preferenceId = preferenceId;
  }

  public int getClientId()
  {
    return clientId;
  }

  public int getPreferenceId()
  {
    return preferenceId;
  }

  @Override public String toString()
  {
    return "ClientsPreferences{" + "clientId=" + clientId + ", preferenceId="
        + preferenceId + '}';
  }
}
