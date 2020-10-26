package aaditya.dev.cafeapp.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    // java.time.OffsetDateTime is a good option for
    // being used for public APIs
    private OffsetDateTime createDate;
    private OffsetDateTime lastUpdateDate;
}
