package io.discordia.msscbrewery.service;

import io.discordia.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
	
	
	public BeerDto getBeerById(UUID beerId) {
		  return BeerDto.builder().id(UUID.randomUUID())
	                .beerName("PBR")
	                .beerStyle("Best")
	                .build();
	}

	public BeerDto saveNewBeer(BeerDto beerDto) {
		  return BeerDto.builder()
	               .id(UUID.randomUUID())
	               .build();
	}

	public void updateBeer(UUID beerId, BeerDto beerDto) {
		 log.debug("updating");
		
	}

	public void deleteById(UUID beerId) {
		  log.debug("Deleting a beer...");
		
	}
	
	
/*

    @Override
    public BeerDto getBeerById(UUID beerId) {
      
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
     
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
      
    }

    @Override
    public void deleteById(UUID beerId) {
      

    }
*/

}
