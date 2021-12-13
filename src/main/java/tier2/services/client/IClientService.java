package tier2.services.client;

import tier2.models.Client;

public interface IClientService
{
  Client GetClient(String username, String password)
      throws IllegalAccessException;


  String CreateClientAccount(Client client);

  void DeleteClient(int clientId);

  Client GetClientByUsername(String username);

  Client GetClientById(int clientId);
}
