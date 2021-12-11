package tier2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tier2.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import tier2.services.client.IClientService;

@RestController
// @RequestMapping(value = "/client")
public class ClientController
{
  @Autowired IClientService service;

  @GetMapping("/login")
  public ResponseEntity getClient(@RequestBody Client client){

    try{
      Client client1 = service.GetClient(client.getUsername(), client.getPassword());
      return new ResponseEntity(client1, HttpStatus.OK);
    } catch (Exception e){
      return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
    }

   // return service.GetClient(client.getUsername(), client.getPassword());

  }

  @GetMapping("/register")
  public ResponseEntity register(@RequestBody Client client){
    try{
      String client1 = service.CreateClientAccount(client);
      return new ResponseEntity(client1, HttpStatus.OK);
    }
    catch(Exception e){
      return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/delete/{clientId}")
  public void deleteClient(@PathVariable int clientId){
    service.DeleteClient(clientId);
  }

  @GetMapping("/accounts")
  public Client getClientByUsername(@RequestParam("Username") String username){
    return service.GetClientByUsername(username);
  }

  @GetMapping("/accounts/{clientId}")
  public Client getClientById(@PathVariable int clientId){
    return service.GetClientById(clientId);
  }

}