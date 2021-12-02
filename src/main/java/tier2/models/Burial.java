package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Burial
{
  @JsonProperty
  private int id;
  @JsonProperty
  private List<Preference> preferences;
  @JsonProperty
  private String name;
  @JsonProperty
  private Date date;
  @JsonProperty
  private String location;
  @JsonProperty
  private int numberOfParticipants;
  @JsonProperty
  private Client client;
  @JsonProperty
  private int clientId;
  @JsonProperty
  private String comments;

  public Burial(){}

  @Override public String toString()
  {
    return "Burial{" + "id=" + id + ", preferences=" + preferences + ", name='"
        + name + '\'' + ", date=" + date + ", location='" + location + '\''
        + ", numberOfParticipants=" + numberOfParticipants + ", clientId="
        + clientId + ", comments='" + comments + '\'' + '}';
  }
}
