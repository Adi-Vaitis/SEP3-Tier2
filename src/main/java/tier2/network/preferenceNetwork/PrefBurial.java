package tier2.network.preferenceNetwork;

import tier2.models.Preference;

import java.util.List;

public interface PrefBurial
{
  List<Preference> getPreferences();
  void addPreference(Preference preference);
}
