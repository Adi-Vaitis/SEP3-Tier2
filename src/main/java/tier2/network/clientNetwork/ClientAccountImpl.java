package tier2.network.clientNetwork;

import com.google.gson.Gson;
import tier2.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tier2.network.communication.SocketClient;
import tier2.network.utility.NetworkPackage;
import tier2.network.utility.NetworkType;

@Component
public class ClientAccountImpl implements ClientAccount
{
  @Autowired SocketClient socketClient;

  @Override public Client GetClient(String Username, String Password)
  {
    Gson gson = new Gson();
    Client client = new Client();
    client.setUsername(Username);
    client.setPassword(Password);
    String serializedAccount = gson.toJson(client);
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.LOGIN, serializedAccount);
    String input = socketClient.communicate(networkPackage);
    return gson.fromJson(input, Client.class);
  }

  @Override public String CreateClientAccount(Client client)
  {
    Gson gson = new Gson();
    String serializedClient = gson.toJson(client);
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.REGISTER, serializedClient);
    return socketClient.communicate(networkPackage);
  }

  @Override public void DeleteClient(int clientId)
  {
    Gson gson = new Gson();
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.DELETECLIENT, String.valueOf(clientId));
    socketClient.communicate(networkPackage);
  }

  @Override public Client GetClientByUsername(String username)
  {
    Gson gson = new Gson();
    Client client = new Client();
    client.setUsername(username);

    String serializedClient = gson.toJson(client);
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.GETCLIENTBYUSERNAME, serializedClient);
    String input = socketClient.communicate(networkPackage);

    return gson.fromJson(input, Client.class);
  }

  @Override public Client GetClientById(int clientId)
  {
    Gson gson = new Gson();
    NetworkPackage networkPackage = new NetworkPackage(NetworkType.GETCLIENTBYID, String.valueOf(clientId));
    String input = socketClient.communicate(networkPackage);
    return gson.fromJson(input, Client.class);
  }
}
