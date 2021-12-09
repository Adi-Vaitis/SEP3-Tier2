package tier2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tier2.models.Burial;
import tier2.services.burial.IBurialService;

import java.util.List;

@RestController
public class BurialController
{
  @Autowired IBurialService burialService;

  @GetMapping("/burials")
  public List<Burial> getBurials(@RequestParam("ClientId") int clientId){
    return burialService.GetBurialsForClient(clientId);
  }

  @PostMapping("/burials")
  public void AddBurial(@RequestBody Burial burial){
    burialService.CreateBurial(burial);
  }

  @PatchMapping("/burials")
  public void editBurial(@RequestBody Burial burial){
    burialService.DeleteBurial(burial);
  }

  @DeleteMapping("/burials/{burialId}")
  public void deleteBurial(@PathVariable int burialId){
    burialService.deleteBurial(burialId);
  }
}
