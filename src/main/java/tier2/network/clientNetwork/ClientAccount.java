package tier2.network.clientNetwork;

import tier2.models.Client;

public interface ClientAccount
{
  Client validateClient(String username, String password);
}
