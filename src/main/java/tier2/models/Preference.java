package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Preference
{
  @JsonProperty
  private int Id;
  @JsonProperty
  private String Description;
  @JsonProperty
  private List<Burial> Burials;

  public Preference(){}

  public void setId(int id)
  {
    this.Id = id;
  }

  public void setDescription(String Description)
  {
    this.Description = Description;
  }

  public int getId()
  {
    return Id;
  }

  public String getDescription()
  {
    return Description;
  }

  @Override public String toString()
  {
    return "Preference{" + "id=" + Id + ", description='" + Description + '\''
        + '}';
  }
}
