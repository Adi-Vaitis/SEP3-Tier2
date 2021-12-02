package tier2.network.burialNetwork;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import tier2.models.Burial;
import tier2.models.PreferenceForBurial;
import tier2.services.communication.SocketClient;
import tier2.services.utility.NetworkPackage;
import tier2.services.utility.NetworkType;

import java.util.List;

public class BurialClientImpl implements BurialClient
{
  @Autowired SocketClient socket;

  @Override public List<Burial> getBurials(int clientId)
  {
    Gson gson = new Gson();
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.BURIALS, String.valueOf(clientId));
    String input = socket.communicate(networkPackage);
    System.out.println(input);
    return gson.fromJson(input, new TypeToken<List<ProjectInfoProperties.Build>>() {
    }.getType());
  }

  @Override public void addBurial(Burial burial)
  {

  }

  @Override public void editBurial(Burial burial)
  {

  }

  @Override public void deleteBurial(int burialId)
  {

  }

  @Override public void addPreferenceToBurial(
      PreferenceForBurial preferenceForBurial)
  {

  }
}
