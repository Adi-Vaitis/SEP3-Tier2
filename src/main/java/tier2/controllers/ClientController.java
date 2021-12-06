package tier2.controllers;

import org.springframework.web.bind.annotation.*;
import tier2.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import tier2.services.client.IClientService;

import java.sql.SQLOutput;

@RestController
public class ClientController
{
  @Autowired IClientService service;

  @GetMapping("/login")
  public Client getClient(@RequestBody Client client){
    return service.validateClient(client.getUsername(), client.getPassword());
  }

  @GetMapping("/register")
  public String register(@RequestBody Client client){
    System.out.println(client);
    System.out.println("REGISTER!!!!!!!!!!!!!!!!!!");
    return service.createClientAccount(client);
  }

  @DeleteMapping("/delete/{clientId}")
  public void deleteClient(@PathVariable int clientId){
    service.deleteClient(clientId);
  }

  @GetMapping("/accounts")
  public Client getClientByUsername(@RequestParam("Username") String username){
    return service.getClientByUsername(username);
  }

  @GetMapping("/accounts/{clientId}")
  public Client getClientById(@PathVariable int clientId){
    return service.getClientById(clientId);
  }

}