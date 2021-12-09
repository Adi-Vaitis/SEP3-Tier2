package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PreferenceForBurial
{
  @JsonProperty
  private int PreferenceId;
  @JsonProperty
  private int BurialId;

  public PreferenceForBurial(){}

  public void setPreferenceId(int PreferenceId)
  {
    this.PreferenceId = PreferenceId;
  }

  public void setBurialId(int BurialId)
  {
    this.BurialId = BurialId;
  }

  public int getPreferenceId()
  {
    return PreferenceId;
  }

  public int getBurialId()
  {
    return BurialId;
  }

  @Override public String toString()
  {
    return "PreferenceForBurial{" + "preferenceId=" + PreferenceId
        + ", burialId=" + BurialId + '}';
  }
}
