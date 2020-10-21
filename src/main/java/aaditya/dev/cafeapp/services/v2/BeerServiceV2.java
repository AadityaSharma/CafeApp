package aaditya.dev.cafeapp.services.v2;

import aaditya.dev.cafeapp.web.model.BeerDto;
import aaditya.dev.cafeapp.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);
    void updateBeer(UUID beerId, BeerDtoV2 beerDto);
    void deleteById(UUID beerId);
}
