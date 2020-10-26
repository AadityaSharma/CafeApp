package aaditya.dev.cafeapp.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    // java.sql.Timestamp is a good data type for
    // being used with databases
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}


