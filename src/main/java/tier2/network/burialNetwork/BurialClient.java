package tier2.network.burialNetwork;

import tier2.models.Burial;
import tier2.models.PreferenceForBurial;

import java.util.List;

public interface BurialClient
{
  List<Burial> GetBurialsForClient(int clientId);
  void CreateBurial(Burial burial);
  void EditBurial(Burial burial);
  void DeleteBurial(int burialId);
  void addPreferenceToBurial(PreferenceForBurial preferenceForBurial);
}
