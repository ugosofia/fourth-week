package com.java.corso.studentboot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "student")
public class Student {

    @Id
    private String id;
    private String nome;
    private String cognome;
    private int età;
    private String email;
}
