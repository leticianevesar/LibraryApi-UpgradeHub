package com.example.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
@Entity
public class Book {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated
    private BookStatus bookStatus;

    @Column
    @NotBlank
    private int bookId;

    @Column
    @NotBlank(message = "BookTitle is mandatory")
    private String bookTitle;

    @Column
    @NotNull
    private String author;

}
