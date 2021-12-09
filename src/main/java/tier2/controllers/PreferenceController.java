package tier2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tier2.models.Preference;
import tier2.services.preference.IPreferenceService;

import java.util.List;

@RestController
public class PreferenceController
{
  @Autowired IPreferenceService preferenceService;

  @GetMapping("/preferences")
  public List<Preference> getPreferences(){
    return preferenceService.GetPreference();
  }

  @PostMapping("/preferences")
  public void addPreference(@RequestBody Preference preference){
    preferenceService.AddPreference(preference);
  }
}
