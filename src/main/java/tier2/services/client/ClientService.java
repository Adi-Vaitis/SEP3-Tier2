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

  @Override public Client GetClient(String username, String password)
  {
    return clientAccount.GetClient(username, password);
  }

  @Override public String CreateClientAccount(Client client)
  {
    System.out.println("REGISTER!!!!!!!!!!!!!!!!!!");
    return clientAccount.CreateClientAccount(client);
  }

  @Override public void DeleteClient(int clientId)
  {
    clientAccount.DeleteClient(clientId);
  }

  @Override public Client GetClientByUsername(String username)
  {
    return clientAccount.GetClientByUsername(username);
  }

  @Override public Client GetClientById(int clientId)
  {
    return clientAccount.GetClientById(clientId);
  }
}
