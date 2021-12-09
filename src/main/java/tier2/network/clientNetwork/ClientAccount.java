package tier2.network.clientNetwork;

import tier2.models.Client;

public interface ClientAccount
{
  Client GetClient(String username, String password);

  String CreateClientAccount(Client client);

  void DeleteClient(int clientId);

  Client GetClientByUsername(String username);

  Client GetClientById(int clientId);
}
