package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PreferenceForBurial
{
  @JsonProperty
  private int preferenceId;
  @JsonProperty
  private int burialId;

  public PreferenceForBurial(){}

  public void setPreferenceId(int preferenceId)
  {
    this.preferenceId = preferenceId;
  }

  public void setBurialId(int burialId)
  {
    this.burialId = burialId;
  }

  public int getPreferenceId()
  {
    return preferenceId;
  }

  public int getBurialId()
  {
    return burialId;
  }

  @Override public String toString()
  {
    return "PreferenceForBurial{" + "preferenceId=" + preferenceId
        + ", burialId=" + burialId + '}';
  }
}
