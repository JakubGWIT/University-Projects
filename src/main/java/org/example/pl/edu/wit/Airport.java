package org.example.pl.edu.wit;

import lombok.Data;

import java.math.BigDecimal;

@Data(staticConstructor = "create")
public class Airport {
    private final String cit
    private final BigDecimal airfare;
    private final String name;
    private final String code;
}
