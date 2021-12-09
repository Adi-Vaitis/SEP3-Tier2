package tier2.services.preference;

import tier2.models.Preference;

import java.util.List;

public interface IPreferenceService
{
  List<Preference> GetPreference();

  void AddPreference(Preference preference);
}
