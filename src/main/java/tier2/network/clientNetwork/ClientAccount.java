package tier2.network.clientNetwork;

import tier2.models.Client;

public interface ClientAccount
{
  Client validateClient(String username, String password);

  String createClientAccount(Client client);

  void deleteClient(int clientId);

  Client getClientByUsername(String username);

  Client getClientById(int clientId);
}
