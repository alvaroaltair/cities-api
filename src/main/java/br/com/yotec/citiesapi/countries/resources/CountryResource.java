package br.com.yotec.citiesapi.countries.resources;

//import com.github.andrelugomes.countries.entities.Country;
//import com.github.andrelugomes.countries.repositories.CountryRepository;
import java.util.List;

import br.com.yotec.citiesapi.countries.entities.Country;
import br.com.yotec.citiesapi.countries.repositories.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/countries")
  public List<Country> cities() {

    return repository.findAll();
  }
}
