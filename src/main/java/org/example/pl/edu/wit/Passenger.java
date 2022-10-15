package org.example.pl.edu.wit;

import lombok.Data;

import javax.swing.text.Document;
@Data
public class Passenger {
    private final String id;
    private final String name;
    private final Document document;
    private final String lastName;

}
