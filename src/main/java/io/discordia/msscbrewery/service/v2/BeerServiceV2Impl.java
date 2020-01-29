package io.discordia.msscbrewery.service.v2;

import io.discordia.msscbrewery.web.model.BeerDto;
import io.discordia.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
