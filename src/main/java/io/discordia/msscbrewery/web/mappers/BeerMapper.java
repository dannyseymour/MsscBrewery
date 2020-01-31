package io.discordia.msscbrewery.web.mappers;


import io.discordia.msscbeerservice.domain.Beer;
import io.discordia.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
