package tier2.services.client;

import tier2.models.Client;
import tier2.network.clientNetwork.ClientAccount;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService
{
  private ClientAccount clientAccount;

  public ClientService(ClientAccount clientAccount){
    this.clientAccount = clientAccount;
  }

  @Override public Client validateClient(String Username, String Password)
  {
    return clientAccount.validateClient(Username, Password);
  }

  @Override public String createClientAccount(Client client)
  {
    return clientAccount.createClientAccount(client);
  }

  @Override public void deleteClient(int clientId)
  {
    clientAccount.deleteClient(clientId);
  }

  @Override public Client getClientByUsername(String username)
  {
    return clientAccount.getClientByUsername(username);
  }

  @Override public Client getClientById(int clientId)
  {
    return clientAccount.getClientById(clientId);
  }
}
