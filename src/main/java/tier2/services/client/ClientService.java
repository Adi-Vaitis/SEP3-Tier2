package tier2.services.client;

import org.springframework.beans.factory.annotation.Autowired;
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

  @Override public Client GetClient(String username, String password) throws IllegalAccessException
  {
    if(clientAccount.GetClient(username, password).getUsername().equals(username) && clientAccount.GetClient(username, password).getPassword().equals(password))
      return clientAccount.GetClient(username, password);

    throw new IllegalAccessException("Not found. Check credentials");
  }



  @Override public String CreateClientAccount(Client client) throws IllegalArgumentException
  {
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
