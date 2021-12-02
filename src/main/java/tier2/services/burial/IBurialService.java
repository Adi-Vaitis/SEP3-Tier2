package tier2.services.burial;

import tier2.models.Burial;

import java.util.List;

public interface IBurialService
{
  List<Burial> getBurials(int clientId);

  void addBurial(Burial burial);

  void editBurial(Burial burial);

  void deleteBurial(int burialId);

}
