package tier2.services.preference;

import org.springframework.stereotype.Service;
import tier2.models.Preference;
import tier2.network.preferenceNetwork.PrefBurial;

import java.util.List;

@Service
public class PreferenceService implements IPreferenceService
{
  private PrefBurial prefBurial;

  public PreferenceService(PrefBurial prefBurial)
  {
    this.prefBurial = prefBurial;
  }

  @Override public List<Preference> GetPreference()
  {
    return prefBurial.getPreferences();
  }

  @Override public void AddPreference(Preference preference)
  {
    prefBurial.addPreference(preference);
  }
}
