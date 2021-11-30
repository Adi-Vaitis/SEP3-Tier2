package tier2.services.client;

import tier2.models.Client;

public interface IClientService
{
  Client validateClient(String Username, String Password);

  String createClientAccount(Client client);

  String editAccount(Client client);

  void deleteClient(int clientId);

  Client getClientByUsername(String username);

  Client getClientById(int clientId);
}
