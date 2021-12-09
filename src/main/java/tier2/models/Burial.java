package tier2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Burial
{
  @JsonProperty
  private int Id;
  @JsonProperty
  private List<Preference> PreferenceForBurial;
  @JsonProperty
  private String FullNameOfDeadMan;
  @JsonProperty
  private Date Date;
  @JsonProperty
  private String Location;
  @JsonProperty
  private int NumberOfParticipants;
  @JsonProperty
  private Client Client;
  @JsonProperty
  private int ClientId;
  @JsonProperty
  private String Comments;

  public Burial(){}

  @Override public String toString()
  {
    return "Burial{" + "id=" + Id + ", preferences=" + PreferenceForBurial + ", name='"
        + FullNameOfDeadMan + '\'' + ", date=" + Date + ", location='" + Location
        + '\''
        + ", numberOfParticipants=" + NumberOfParticipants + ", clientId="
        + ClientId + ", comments='" + Comments + '\'' + '}';
  }
}
