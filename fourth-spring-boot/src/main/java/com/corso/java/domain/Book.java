package com.corso.java.domain;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books")
public class Book {

    @Id
    private Integer id;

    private String name;
    private Integer pages;
    private String author;
    private Double cost;
}
