package tier2.services.burial;

import org.springframework.stereotype.Service;
import tier2.models.Burial;
import tier2.network.burialNetwork.BurialClient;

import java.util.List;

@Service
public class BurialService implements IBurialService
{
  private BurialClient burialClient;

  public BurialService(BurialClient burialClient)
  {
    this.burialClient = burialClient;
  }

  @Override public List<Burial> getBurials(int clientId)
  {
    return burialClient.getBurials(clientId);
  }

  @Override public void addBurial(Burial burial)
  {
    burialClient.addBurial(burial);
  }

  @Override public void editBurial(Burial burial)
  {
    burialClient.editBurial(burial);
  }

  @Override public void deleteBurial(int burialId)
  {
    burialClient.deleteBurial(burialId);
  }
}
