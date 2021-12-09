package tier2.services.burial;

import org.springframework.stereotype.Service;
import tier2.models.Burial;
import tier2.network.burialNetwork.BurialClient;

import java.util.List;

@Service
public class BurialService implements IBurialService
{
  private BurialClient burialClient;

  @Override public List<Burial> GetBurialsForClient(int clientId)
  {
    return burialClient.GetBurialsForClient(clientId);
  }

  @Override public void CreateBurial(Burial burial)
  {
    burialClient.CreateBurial(burial);
  }

  @Override public void DeleteBurial(Burial burial)
  {
    burialClient.EditBurial(burial);
  }

  @Override public void deleteBurial(int burialId)
  {
    burialClient.DeleteBurial(burialId);
  }
}
