package tier2.services.burial;

import tier2.models.Burial;

import java.util.List;

public interface IBurialService
{
  List<Burial> GetBurialsForClient(int clientId);

  void CreateBurial(Burial burial);

  void DeleteBurial(Burial burial);

  void deleteBurial(int burialId);

}
