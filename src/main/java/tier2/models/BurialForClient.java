package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BurialForClient
{
  @JsonProperty
  private int BurialId;
  @JsonProperty
  private int ClientId;

  public BurialForClient(){}

  public void setBurialId(int burialId)
  {
    this.BurialId = burialId;
  }

  public void setClientId(int clientId)
  {
    this.ClientId = clientId;
  }

  public int getBurialId()
  {
    return BurialId;
  }

  public int getClientId()
  {
    return ClientId;
  }

  @Override public String toString()
  {
    return "BurialForClient{" + "burialId=" + BurialId + ", clientId="
        + ClientId + '}';
  }
}
