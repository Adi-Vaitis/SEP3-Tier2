package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BurialForClient
{
  @JsonProperty
  private int burialId;
  @JsonProperty
  private int clientId;

  public BurialForClient(){}

  public void setBurialId(int burialId)
  {
    this.burialId = burialId;
  }

  public void setClientId(int clientId)
  {
    this.clientId = clientId;
  }

  public int getBurialId()
  {
    return burialId;
  }

  public int getClientId()
  {
    return clientId;
  }

  @Override public String toString()
  {
    return "BurialForClient{" + "burialId=" + burialId + ", clientId="
        + clientId + '}';
  }
}
