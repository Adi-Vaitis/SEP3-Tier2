package tier2.controllers;

import tier2.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tier2.services.client.IClientService;

@RestController
public class ClientController
{
  @Autowired IClientService service;

  @PostMapping("/login")
  public Client getClient(@RequestBody Client client){
    return service.validateClient(client.getUsername(), client.getPassword());
  }

}