package mex.edu.utez.examen.controllers.book.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class BookDto {
    private Long id;
    private String title;
    private String ISBN;
    private String author;
    private int pages;
    private String category;
    private LocalDate date;
    private String folio;
}
