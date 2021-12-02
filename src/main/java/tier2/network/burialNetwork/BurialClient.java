package tier2.network.burialNetwork;

import tier2.models.Burial;
import tier2.models.PreferenceForBurial;

import java.util.List;

public interface BurialClient
{
  List<Burial> getBurials(int clientId);
  void addBurial(Burial burial);
  void editBurial(Burial burial);
  void deleteBurial(int burialId);
  void addPreferenceToBurial(PreferenceForBurial preferenceForBurial);
}
