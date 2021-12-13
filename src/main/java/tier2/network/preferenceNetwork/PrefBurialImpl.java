package tier2.network.preferenceNetwork;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tier2.models.Preference;
import tier2.network.communication.SocketClient;
import tier2.network.utility.NetworkPackage;
import tier2.network.utility.NetworkType;

import java.util.List;

@Component
public class PrefBurialImpl implements PrefBurial
{
  @Autowired private SocketClient socket;

  @Override public List<Preference> getPreferences()
  {
    Gson gson = new Gson();
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.PREFERENCES, null);
    String input =  socket.communicate(networkPackage);

    System.out.println(input);

    return gson.fromJson(input, new TypeToken<List<Preference>>(){}.getType());
  }

  @Override public void addPreference(Preference preference)
  {
    Gson gson = new Gson();
    String preferenceSerialized = gson.toJson(preference);
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.ADDPREFERENCE, preferenceSerialized);
    socket.communicate(networkPackage);
  }
}
