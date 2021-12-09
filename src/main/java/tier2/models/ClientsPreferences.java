package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientsPreferences
{
  @JsonProperty
  private int ClientId;
  @JsonProperty
  private int PreferenceId;

  public ClientsPreferences(){}

  public void setClientId(int ClientId)
  {
    this.ClientId = ClientId;
  }

  public void setPreferenceId(int PreferenceId)
  {
    this.PreferenceId = PreferenceId;
  }

  public int getClientId()
  {
    return ClientId;
  }

  public int getPreferenceId()
  {
    return PreferenceId;
  }

  @Override public String toString()
  {
    return "ClientsPreferences{" + "clientId=" + ClientId + ", preferenceId="
        + PreferenceId + '}';
  }
}
