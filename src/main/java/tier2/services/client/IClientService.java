package tier2.services.client;

import tier2.models.Client;

public interface IClientService
{
  Client validateClient(String Username, String Password);
}
