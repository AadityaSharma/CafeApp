package aaditya.dev.cafeapp.web.mappers;

import aaditya.dev.cafeapp.domain.Beer;
import aaditya.dev.cafeapp.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
