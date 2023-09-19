package com.cripto.uninove.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CoinModel {
    @JsonAlias("id")
    String id;
    @JsonAlias("symbol")
    String symbol;
    @JsonAlias("name")
    String name;
}
