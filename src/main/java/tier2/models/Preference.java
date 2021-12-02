package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Preference
{
  @JsonProperty
  private int id;
  @JsonProperty
  private String description;
  @JsonProperty
  private List<Burial> burials;

  public Preference(){}

  public void setId(int id)
  {
    this.id = id;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public int getId()
  {
    return id;
  }

  public String getDescription()
  {
    return description;
  }

  @Override public String toString()
  {
    return "Preference{" + "id=" + id + ", description='" + description + '\''
        + '}';
  }
}
